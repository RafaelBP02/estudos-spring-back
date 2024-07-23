package br.com.estudos_spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos_spring.api.model.Client;
import br.com.estudos_spring.api.repo.Repo;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    
    @Autowired
    private Repo action;

    @PostMapping("/")
    public Client register(@RequestBody Client c){
        return action.save(c);
    }

    @PutMapping("/")
    public Client edit(@RequestBody Client c){
        return action.save(c);
    }

    @GetMapping("/")
    public Iterable<Client> selectClients(){
        return action.findAll();
    }

    @DeleteMapping("/{codigo}")
    public void deleteClient(@PathVariable Long codigo){
        action.deleteById(codigo);
    }
}
