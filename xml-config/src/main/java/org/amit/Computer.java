package org.amit;

import org.amit.processor.Processor;
import org.amit.ram.Ram;
import org.amit.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    Ram rm;
    Storage str;
    Processor psr;
    String brand="";
    List<String> ports=new ArrayList<>();


    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    Computer(Ram rm)
    {
        this.rm=rm;

    }


    public void setStr(Storage str) {
        this.str = str;
    }

    public void setPsr(Processor psr) {
        this.psr = psr;
    }

    public Processor getPsr() {
        return psr;
    }
    public void init() {
        System.out.println("Computer is assembled and ready!");
    }

    public void shutdown() {
        System.out.println("Computer is shutting down...");
    }
    public void config()
    {
        rm.getramtype();
        str.getstoragetype();
        psr.getprocessortype();
        System.out.println("Computer Brand"+brand);
        System.out.println("Available Ports"+getPorts());
    }
}
