package com.cubeit.testapi.services.interfaces;

import java.util.List;

import com.cubeit.testapi.models.Tache;

public interface ITacheService {
    
    Tache addTache(Tache t);
    Tache updTache(Tache t);
    Tache retrieveTache(String id);
    List<Tache> retrieveAllTaches();
    void deleteTache(String id);
	
    
    
    

}
