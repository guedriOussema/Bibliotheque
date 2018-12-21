package com.insat.controller;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insat.model.Client;
import com.insat.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    ClientService clientService;


    @CrossOrigin(origins = "*")
    @GetMapping("/clients")
    public List<Client> getAll(){
        return clientService.getClients();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/clients/{id}")
    public Optional<Client> getOneWithId(@PathVariable("id")  Long id){
        System.out.println(id);
        return clientService.getById(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/clients/add")
    public Client add(@Valid @RequestBody Client client){
        return  clientService.addClient(client);
    }


    @CrossOrigin(origins = "*")
    @PutMapping("/notes/update")
    public ResponseEntity<Client> update( @RequestBody Client newClient){
        Optional<Client> oldClient = getOneWithId(newClient.getId());
        if(oldClient.isPresent()){
            return new ResponseEntity<Client>(add(newClient),HttpStatus.OK);
        }else{
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
 
}

