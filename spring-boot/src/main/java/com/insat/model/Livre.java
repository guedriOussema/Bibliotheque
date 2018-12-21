package com.insat.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "livre")
public class Livre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    private String title;

    private String description;
    
    private String categorie;
    
    private Integer nbre_dispo;
    
    private float prix;
    
    private String auteur;
    private String photo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNbre_dispo() {
		return nbre_dispo;
	}

	public void setNbre_dispo(Integer nbre_dispo) {
		this.nbre_dispo = nbre_dispo;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	

}


