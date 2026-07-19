package org.amit;

import org.amit.deliveryservice.DeliveryService;
import org.amit.deliveryservice.DroneDelivery;
import org.amit.kitchen.Kitchen;
import org.amit.paymentgateway.PaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
     Kitchen kit;
     DeliveryService del;
     @Autowired
             @Qualifier("cardPayment")
     PaymentGateway pay;

    @Autowired
    public void setDel(DeliveryService del) {
        this.del = del;
    }

    Restaurant(Kitchen kit)
     {
        this.kit=kit;
     }

    public void setPay(PaymentGateway pay) {
        this.pay = pay;
    }

    public void resturent()
    {
        System.out.println("This is An Amazing Restaurant");
        kit.gettypeofkitchen();
        del.gettypeofdelivery();
        pay.getypeofpayment();
    }
}
