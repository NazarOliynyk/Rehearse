package Patterns.Singleton;

// https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
// https://habr.com/ru/post/129494/
// https://habr.com/ru/post/27108/

import java.lang.reflect.Constructor;

public class UseReflectionToTest {

    public static void main(String[] args) {

        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();

        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}