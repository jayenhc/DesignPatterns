package creational.factory;

/**
 * Created by jchondig on 17/10/2017.
 */
public class ComputerFactory {

    /*
    We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
    Notice that based on the input parameter, different subclass is created and returned.
    */

    //factory pattern
    public static Computer getComputer(final String type, final String ram, final String hdd, final String cpu) {
        if ("pc".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }


    //abstract facotry pattern
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

    /*
     Abstract Factory pattern provides approach to code for interface rather than implementation.
     Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products,
     for example we can add another sub-class Laptop and a factory LaptopFactory.
     Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
     */

}
