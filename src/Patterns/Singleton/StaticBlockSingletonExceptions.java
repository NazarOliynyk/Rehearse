package Patterns.Singleton;

public class StaticBlockSingletonExceptions {

    private static StaticBlockSingletonExceptions instance;

    private StaticBlockSingletonExceptions(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingletonExceptions();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingletonExceptions getInstance(){
        return instance;
    }
}