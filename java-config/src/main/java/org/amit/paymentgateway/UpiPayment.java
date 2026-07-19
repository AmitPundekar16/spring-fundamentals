package org.amit.paymentgateway;

import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements PaymentGateway{
    public void getypeofpayment()
    {
        System.out.println("UpiPayment is Available");
    }
}
