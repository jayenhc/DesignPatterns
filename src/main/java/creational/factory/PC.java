package creational.factory;

/**
 * Created by jchondig on 17/10/2017.
 */
public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;
    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}
