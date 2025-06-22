package com.primo.progetto.primo.controller;

import com.primo.progetto.primo.beans.Veicolo;
import com.primo.progetto.primo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/veicoloController")
    public Veicolo veicoloController() {
        Veicolo veicolo = new Veicolo();
        veicolo.setName("Controller");
        return veicolo;
    }

    @GetMapping("/veicoloSpring")
    public Veicolo veicoloSpring() {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Veicolo veicolo = context.getBean(Veicolo.class);
        return veicolo;
    }

}
