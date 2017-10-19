package creational.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jchondig on 17/10/2017.
 */
public class ComputerFactoryTest {

    public static final String PC_RAM = "8GB";
    public static final String PC_HDD = "100GB";
    public static final String PC_CPU = "i3";

    public static final String SERVER_RAM = "16GB";
    public static final String SERVER_HDD = "1TB";
    public static final String SERVER_CPU = "i7";
    ComputerFactory computerFactory = new ComputerFactory();

    @Test
    public void getComputer() throws Exception {
        Computer pc = ComputerFactory.getComputer("pc", PC_RAM, PC_HDD, PC_CPU);
        Computer server = ComputerFactory.getComputer("server", SERVER_RAM, SERVER_HDD, SERVER_CPU);

        assertTrue(pc instanceof PC);
        assertFalse(pc instanceof Server);
        assertEquals(PC_RAM, pc.getRam());
        assertEquals(PC_CPU, pc.getCpu());
        assertEquals(PC_HDD, pc.getHdd());

        assertTrue(server instanceof Server);
        assertFalse(server instanceof PC);
        assertEquals(SERVER_CPU, server.getCpu());
        assertEquals(SERVER_HDD, server.getHdd());
        assertEquals(SERVER_RAM, server.getRam());

    }

}