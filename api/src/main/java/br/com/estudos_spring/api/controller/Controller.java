package br.com.estudos_spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos_spring.api.model.Client;
import br.com.estudos_spring.api.repo.Repo;

@RestController
public class Controller {
    
    @Autowired
    private Repo action;

    @PostMapping("/")
    public Client register(@RequestBody Client c){
        return action.save(c);
    }

    @GetMapping("/")
    public String teste(){
        return "Hello World";
    }
}
