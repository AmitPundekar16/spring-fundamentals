package org.amit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Restaurant res;

       ApplicationContext con=new AnnotationConfigApplicationContext(Appconfig.class);
       res=con.getBean(Restaurant.class);
       res.resturent();
    }
}