package org.amit.paymentgateway;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentGateway{
    public void getypeofpayment()
    {
        System.out.println("CardPayment is Available");
    }
}
