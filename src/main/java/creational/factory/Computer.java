package creational.factory;

/**
 * Created by jchondig on 13/10/2017.
 */
public abstract class Computer {

    public abstract String getRam();
    public abstract String getCpu();
    public abstract String getHdd();

    @Override
    public String toString(){
        return "Ram: " + getRam() + ", cpu: " + getCpu() + ", hdd: " + getHdd();
    }
}
