package org.amit.deliveryservice;

import org.springframework.stereotype.Component;

@Component
public class BikeDelivery implements DeliveryService{

    public void gettypeofdelivery()
    {
        System.out.println("BikeDelivery is Available");
    }
}
