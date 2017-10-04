package creational.singleton;

/**
 * Created by jchondig on 04/10/2017.
 */
public class EagerInitializedSingleton {

    static EagerInitializedSingleton singleton = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return singleton;
    }
}
