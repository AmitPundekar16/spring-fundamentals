package com.example.annotation_config.pharmacy;

import org.springframework.stereotype.Component;

@Component
public class OutsourcedPharmacy implements Pharmacy{
    public void getpharmacytype()
    {
        System.out.println("This is an OutsourcedPharmacy");
    }
}
