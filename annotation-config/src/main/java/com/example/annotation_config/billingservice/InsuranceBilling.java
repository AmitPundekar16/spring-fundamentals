package com.example.annotation_config.billingservice;

import org.springframework.stereotype.Component;

@Component
public class InsuranceBilling implements BillingService{
    public void getbillingtype()
    {
        System.out.println("Insurance billing service is available");
    }
}
