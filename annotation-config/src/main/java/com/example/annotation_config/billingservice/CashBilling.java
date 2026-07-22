package com.example.annotation_config.billingservice;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CashBilling implements BillingService{
    public void getbillingtype()
    {
        System.out.println("Cash billing service is available");

    }
}
