package com.insat.service;

import java.util.List;



import com.insat.model.Categorie;

public interface CategorieService {
    List<Categorie> getCategories();

    Categorie addCategories(Categorie categorie);
    
    void deleteCategorieById(Long id);

}
