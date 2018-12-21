package com.insat.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insat.model.Categorie;
import com.insat.service.CategorieService;


@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    CategorieService categorieService;


    @CrossOrigin(origins = "*")
    @GetMapping("/categories")
    public List<Categorie> getAll(){
        return categorieService.getCategories();
    }



    @CrossOrigin(origins = "*")
    @PostMapping("/categories/add")
    public Categorie add(@Valid @RequestBody Categorie categorie){
        return  categorieService.addCategories(categorie);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/categories/delete/{id}")
    public void deletebyid( @PathVariable Long id){
        categorieService.deleteCategorieById(id);
    }


 
}