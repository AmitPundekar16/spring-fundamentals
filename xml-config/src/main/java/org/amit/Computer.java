package org.amit;

import org.amit.processor.Processor;
import org.amit.ram.Ram;
import org.amit.storage.Storage;

public class Computer {
    Ram rm;
    Storage str;
    Processor psr;

    public void config()
    {
        System.out.println("Computer class invoked");
    }
}
