package creational.singleton;

/**
 * Created by jchondig on 04/10/2017.
 */
public class LazyInitializedSingleton {

    static LazyInitializedSingleton singleton;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyInitializedSingleton();
        }
        return singleton;
    }
}
