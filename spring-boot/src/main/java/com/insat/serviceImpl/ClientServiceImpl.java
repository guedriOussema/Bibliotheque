package com.insat.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insat.model.Client;
import com.insat.repository.ClientRepository;
import com.insat.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;


    public List<Client> getClients() {
        return clientRepository.findAll();
    }


    public Client addClient(Client client) {
        return clientRepository.save(client);
    }


    public Optional<Client> getById(Long id) {
        return clientRepository.findById(id);
    }




}


