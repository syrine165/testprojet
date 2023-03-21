package com.cubeit.testapi.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "testprojets")
@Data @NoArgsConstructor @AllArgsConstructor
public class TestProjet {
	
	@Id
	private String id;
	
	private String nom;
	
	private String details;

	public TestProjet(String nom, String details) {
		super();
		this.nom = nom;
		this.details = details;
	}

}
