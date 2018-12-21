package com.insat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "categorie")
public class Categorie {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    public String nom;

}
