package com.insat.service;

import java.util.List;

import java.util.Optional;


import com.insat.model.Livre;
public interface LivreService {
    List<Livre> getLivres();

    Livre addLivres(Livre livre);
    
    void deleteLivreById(Long id);
    
    List<Livre> getByTitle(String title);

   Optional<Livre> getById(Long id);
}
