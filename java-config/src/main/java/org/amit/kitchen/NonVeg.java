package org.amit.kitchen;

import org.springframework.stereotype.Component;

@Component
public class NonVeg implements Kitchen{

    public void gettypeofkitchen()
    {
        System.out.println("its an Nonvegeterian kitchen");
    }
}
