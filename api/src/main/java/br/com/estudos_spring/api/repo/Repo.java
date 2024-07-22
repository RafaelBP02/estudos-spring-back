package br.com.estudos_spring.api.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.estudos_spring.api.model.Client;

@Repository
public interface Repo extends CrudRepository<Client, Long> {

    
}
