package com.cubeit.testapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubeit.testapi.models.Tache;
import com.cubeit.testapi.repositories.TacheRepository;
import com.cubeit.testapi.services.interfaces.ITacheService;

@Service
public class TacheServiceImpl implements ITacheService{

    @Autowired
    private TacheRepository tacheRepository;

    @Override
    public List<Tache> retrieveAllTaches() {
        
        List<Tache>taches=tacheRepository.findAll();

        return taches;
    }

    @Override
    public Tache addTache(Tache t) {
        
        tacheRepository.save(t);
        return t ;
    }

    @Override
    public Tache updTache(Tache t) {
        
        tacheRepository.save(t);
        return t;
    }

    @Override
    public Tache retrieveTache(String id) {
        
        Tache t = tacheRepository.findById(id).get();       
        return t;
    }

    @Override
    public void deleteTache(String id) {
       tacheRepository.deleteById(id);
        
    }

	

   

    

    

    

   

    
    
}

