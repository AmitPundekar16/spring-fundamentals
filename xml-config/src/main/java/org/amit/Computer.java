package org.amit;

import org.amit.processor.Processor;
import org.amit.ram.Ram;
import org.amit.storage.Storage;

public class Computer {
    Ram rm;
    Storage str;
    Processor psr;
    String brand="";
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

    public void config()
    {
        rm.getramtype();
        str.getstoragetype();
        psr.getprocessortype();
        System.out.println("Computer class invoked");
    }
}
