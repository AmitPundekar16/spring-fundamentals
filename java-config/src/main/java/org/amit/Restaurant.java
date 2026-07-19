package org.amit;

import org.amit.kitchen.Kitchen;
import org.amit.paymentgateway.PaymentGateway;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    Kitchen kit;
     Restaurant(Kitchen kit)
     {
        this.kit=kit;
     }
    public void resturent()
    {
        System.out.println("This is An Amazing Restaurant");
    }
}
