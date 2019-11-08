package Patterns.Singleton;

// constructor is private in most cases in order to force creating objects with the
// help og getters

public class BillPughInnerClass {

    private BillPughInnerClass(){}

    private static class SingletonHelper{
        private static final BillPughInnerClass INSTANCE = new BillPughInnerClass();
    }

    public static BillPughInnerClass getInstance(){
        return SingletonHelper.INSTANCE;
    }
}