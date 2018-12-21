package com.insat.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insat.model.Categorie;
import com.insat.repository.CategorieRepository;
import com.insat.service.CategorieService;


@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    CategorieRepository categorieRepository;


    public List<Categorie> getCategories() {
        return categorieRepository.findAll();
    }




    public void deleteCategorieById(Long id) {
         categorieRepository.deleteById(id);
    }





	
	public Categorie addCategories(Categorie categorie) {
		
		return categorieRepository.save(categorie);
	}
}
