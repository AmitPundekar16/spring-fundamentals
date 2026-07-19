package org.amit;

import org.amit.kitchen.Kitchen;
import org.amit.kitchen.Veg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.amit")
public class Appconfig {


    @Bean
    public Veg getveg()
    {
        return new Veg();
    }
}
