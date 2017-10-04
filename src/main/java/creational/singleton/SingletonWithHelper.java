package creational.singleton;

/**
 * Created by jchondig on 04/10/2017.
 *
 */
public class SingletonWithHelper {

    private SingletonWithHelper(){}

    //This is the most widely used approach for Singleton class as it doesn’t
    //require synchronization.
    private static class SingletonHelper{
        private static final SingletonWithHelper SINGLETON = new SingletonWithHelper();
    }

    public static SingletonWithHelper getInstance(){
        return SingletonHelper.SINGLETON;
    }

}
