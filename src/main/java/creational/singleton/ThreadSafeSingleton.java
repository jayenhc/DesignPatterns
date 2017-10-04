package creational.singleton;

/**
 * Created by jchondig on 04/10/2017.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }

}
