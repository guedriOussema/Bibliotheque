package com.insat.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.insat.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}