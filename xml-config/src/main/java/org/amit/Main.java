package org.amit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");

        Computer cm=(Computer)ap.getBean("cmp");
        cm.config();
    }
}