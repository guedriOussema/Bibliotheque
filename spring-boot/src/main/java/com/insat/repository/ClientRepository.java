package com.insat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insat.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
