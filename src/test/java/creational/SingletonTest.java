package creational;

import creational.singleton.EagerInitializedSingleton;
import creational.singleton.EnumSingleton;
import creational.singleton.LazyInitializedSingleton;
import creational.singleton.SingletonWithHelper;
import creational.singleton.ThreadSafeDoubleCheckSingleton;
import creational.singleton.ThreadSafeSingleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jchondig on 26/02/2017.
 */
public class SingletonTest {

    @Before
    public void before() {

    }

    @Test
    public void testLazyInitializedSingleton(){
        LazyInitializedSingleton firstObject = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton secondObject = LazyInitializedSingleton.getInstance();

        Assert.assertEquals(firstObject,secondObject);
    }

    @Test
    public void testEagerInitializedSingleton(){
        EagerInitializedSingleton firstObject = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondObjcet = EagerInitializedSingleton.getInstance();

        Assert.assertEquals(firstObject,secondObjcet);
    }

    @Test
    public void testThreadSafeSingleton(){
        ThreadSafeSingleton firstObject = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton secondObject = ThreadSafeSingleton.getInstance();

        Assert.assertEquals(firstObject,secondObject);
    }

    @Test
    public void testThreadSafeDoubleCheckSingleton(){
        ThreadSafeDoubleCheckSingleton firstObject = ThreadSafeDoubleCheckSingleton.getInstance();
        ThreadSafeDoubleCheckSingleton secondObject = ThreadSafeDoubleCheckSingleton.getInstance();

        Assert.assertEquals(firstObject,secondObject);
    }

    @Test
    public void testSingletonWithHelper(){
        SingletonWithHelper firstObject = SingletonWithHelper.getInstance();
        SingletonWithHelper secondObject = SingletonWithHelper.getInstance();

        Assert.assertEquals(firstObject,secondObject);
    }

    @Test
    public void testEnumSingleton(){
        EnumSingleton firstObject = EnumSingleton.INSTANCE;
        EnumSingleton secondObject = EnumSingleton.INSTANCE;

        Assert.assertEquals(firstObject,secondObject);
    }
}