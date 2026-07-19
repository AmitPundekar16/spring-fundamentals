package org.amit.deliveryservice;

import org.springframework.stereotype.Component;

@Component
public class DroneDelivery implements DeliveryService{
    public void gettypeofdelivery()
    {
        System.out.println("DroneDelivery is Available");
    }
}
