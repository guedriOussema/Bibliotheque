package com.insat.controller;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.insat.model.Livre;
import com.insat.service.LivreService;

@RestController
@RequestMapping("/api")
public class LivreController {

    @Autowired
    LivreService livreService;


    @CrossOrigin(origins = "*")
    @GetMapping("/livres")
    public List<Livre> getAll(){
        return livreService.getLivres();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/livres/{id}")
    public Optional<Livre> getOneWithId(@PathVariable("id")  Long id){
        System.out.println(id);
        return livreService.getById(id);
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/livres/{title}")
    public List<Livre> getOneWithId(@PathVariable("title")  String title){
        System.out.println(title);
        return livreService.getByTitle(title);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/livres/add")
    public Livre add(@Valid @RequestBody Livre livre){
        return  livreService.addLivres(livre);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/livres/delete/{id}")
    public void deletebyid( @PathVariable Long id){
        livreService.deleteLivreById(id);
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/livres/update")
    public ResponseEntity<Livre> update( @RequestBody Livre newLivre){
        Optional<Livre> oldLivre = getOneWithId(newLivre.getId());
        if(oldLivre.isPresent()){
            return new ResponseEntity<Livre>(add(newLivre),HttpStatus.OK);
        }else{
            return new ResponseEntity<Livre>(HttpStatus.NOT_FOUND);
        }
    }
 
}
