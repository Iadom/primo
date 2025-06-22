package com.primo.progetto.primo.config;

import com.primo.progetto.primo.beans.Veicolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is used to create a configuration class.
 */
@Configuration // Spring IOC
public class ProjectConfig {

    @Bean
    Veicolo veicolo() {
        var veicolo = new Veicolo();
        veicolo.setName("Fiat");
        return veicolo;
    }

    @Bean
    String hello() {
        return "Hello";
}
    @Bean
    Integer number() {
        return 10;
    }

}
