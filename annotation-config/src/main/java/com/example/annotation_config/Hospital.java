package com.example.annotation_config;

import com.example.annotation_config.billingservice.BillingService;
import com.example.annotation_config.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.example.annotation_config.pharmacy.Pharmacy;

@Component
public class Hospital {


    Doctor dr;
    BillingService bs;

    @Autowired
    Pharmacy phr;

    @Value("Amit com.example.annotation_config.Hospital")
    String str;

   @Autowired
    Hospital(Doctor dr)
    {
        System.out.println("Hospital bean created:");
        this.dr=dr;
    }


    @Autowired
    public void setBs(BillingService bs) {
        this.bs = bs;
    }

    void display()
    {
        dr.gettypeofdoctor();
        bs.getbillingtype();
        phr.getpharmacytype();
    }
}
