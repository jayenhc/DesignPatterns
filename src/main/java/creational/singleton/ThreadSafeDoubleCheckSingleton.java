package creational.singleton;

/**
 * Created by jchondig on 04/10/2017.
 */
public class ThreadSafeDoubleCheckSingleton {

    private static ThreadSafeDoubleCheckSingleton singleton;

    private ThreadSafeDoubleCheckSingleton() {
    }

    public static synchronized ThreadSafeDoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (ThreadSafeDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new ThreadSafeDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
