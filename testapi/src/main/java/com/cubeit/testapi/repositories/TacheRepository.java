package com.cubeit.testapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.cubeit.testapi.models.Tache;



//@RestResource
//@CrossOrigin("*")
public interface TacheRepository extends MongoRepository <Tache , String> {
    




}
