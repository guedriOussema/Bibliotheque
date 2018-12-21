package com.insat.service;


import java.util.List;
import java.util.Optional;

import com.insat.model.Client;
public interface ClientService {
    List<Client> getClients();

    Client addClient(Client client);


    Optional<Client> getById(Long id);
}
