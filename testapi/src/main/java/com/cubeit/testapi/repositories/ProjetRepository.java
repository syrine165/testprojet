package com.cubeit.testapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cubeit.testapi.models.Projet;

public interface ProjetRepository extends MongoRepository<Projet, String>{

}
