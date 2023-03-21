package com.cubeit.testapi.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "taches")
@Data @NoArgsConstructor @AllArgsConstructor
public class Tache {
    
    @Id
    private String id;

    @Indexed(unique=true,direction=IndexDirection.DESCENDING)
    private String titre;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datecreation;

    private String etat;
    
    @DBRef
    private List<Projet> Projets;
    
    @DBRef
    private TestProjet test;

    public Tache(String titre, String description, Date datecreation, String etat) {
        super();
        this.titre = titre;
        this.description = description;
        this.datecreation = datecreation;
        this.etat = etat;
    }





    
}
