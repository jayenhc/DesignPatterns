package creational.singleton;

/**
 * Created by jchondig on 04/10/2017.
 */


public enum EnumSingleton {
    INSTANCE;

    public void someMethod(){
        /*Reflection can be used to destroy all the singleton
        To overcome this situation with Reflection, Joshua Bloch suggests the use of
        Enum to implement Singleton design pattern as Java ensures that any enum
        value is instantiated only once in a Java program*/
    }
}
