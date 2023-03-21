package com.cubeit.testapi.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cubeit.testapi.models.Tache;
import com.cubeit.testapi.repositories.TacheRepository;
import com.cubeit.testapi.services.interfaces.ITacheService;




@RestController
@RequestMapping("cubeit/api/taches")
public class TacheRestController {

    @Autowired
    private TacheRepository tacheRepository;
    
    @Autowired
    private ITacheService tacheService;

    //APIfindAlltaches
    @GetMapping("/all")
    @ResponseBody
    public List<Tache> getTaches(){

        List<Tache> taches=tacheService.retrieveAllTaches();
        
        return taches;

    }

    //API find tache ById
    @GetMapping("/find-one/{id}")
    @ResponseBody
    public Tache getTachesById(@PathVariable("id")String id){

        //Tache tache =tacheService.retrieveTache(id);
        //return tache;
        return tacheService.retrieveTache(id);

    }

    //API create Tache
    @PostMapping("/create-one")
    @ResponseBody
    public Tache createOne(@RequestBody Tache t){

        tacheService.addTache(t);

        return t;

    }

    //API update Tache
    @PutMapping("/update-one")
    @ResponseBody
    public Tache updateOne(@RequestBody Tache t){

        tacheService.updTache(t);

        return t;

    }

    //API delete Tache ById
    @DeleteMapping("/delete-one/{id}")
    @ResponseBody
    public String deleteTacheById(@PathVariable("id")String id){

        Tache tache= tacheService.retrieveTache(id);
        tacheService.deleteTache(id);
        return "Tache"+ tache+"Deleted Successfully";

    }


   

     

    
    
}
