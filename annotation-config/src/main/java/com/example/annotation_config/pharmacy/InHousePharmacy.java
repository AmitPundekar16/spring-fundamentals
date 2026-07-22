package com.example.annotation_config.pharmacy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class InHousePharmacy {
    public void getpharmacytype()
    {
        System.out.println("This is an InHousePharmacy");
    }
}
