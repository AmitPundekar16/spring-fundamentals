package org.amit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Restaurant res,res1;
       ApplicationContext con=new AnnotationConfigApplicationContext(Appconfig.class);
        res1=(Restaurant) con.getBean("restaurant");
        res1.nm="Non Amazing Restaurant";
        res1.resturent();
       res=(Restaurant) con.getBean("restaurant");
       res.resturent();
    }
}