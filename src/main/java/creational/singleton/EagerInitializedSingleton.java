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

/*
Sometimes in distributed systems, we need to implement Serializable
interface in Singleton class so that we can store its state in file system

The problem with serialized singleton class is that whenever we
deserialize it, it will create a new instance of the class.

So it destroys the singleton pattern, to overcome this scenario all we need to
do it provide the implementation of readResolve() method.

protected Object readResolve() {
  return getInstance();
}
 */