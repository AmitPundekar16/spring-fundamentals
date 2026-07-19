package org.amit.deliveryservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BikeDelivery implements DeliveryService{

    public void gettypeofdelivery()
    {
        System.out.println("BikeDelivery is Available");
    }
}
