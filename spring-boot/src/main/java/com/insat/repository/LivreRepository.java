package com.insat.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.insat.model.Livre;
@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
	
public List<Livre> getByTitle(String title);
}
