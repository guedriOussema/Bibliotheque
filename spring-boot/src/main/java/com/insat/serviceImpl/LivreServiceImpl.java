package com.insat.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insat.model.Livre;
import com.insat.repository.LivreRepository;
import com.insat.service.LivreService;


@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    LivreRepository livreRepository;


    public List<Livre> getLivres() {
        return livreRepository.findAll();
    }




    public void deleteLivreById(Long id) {
         livreRepository.deleteById(id);
    }
    
    public List<Livre> getByTitle(String title) {
        return livreRepository.getByTitle(title);
   }


    public Optional<Livre> getById(Long id) {
        return livreRepository.findById(id);
    }


	
	public Livre addLivres(Livre livre) {
		// TODO Auto-generated method stub
		return livreRepository.save(livre);
	}






}



