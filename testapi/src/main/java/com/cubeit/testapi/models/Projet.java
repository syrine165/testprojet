package com.cubeit.testapi.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "projets")
@Data @NoArgsConstructor @AllArgsConstructor
public class Projet {
	
	@Id
	private String id;
	
	private String détailsprojet;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datedepot;

	public Projet(String détailsprojet, Date datedepot) {
		super();
		this.détailsprojet = détailsprojet;
		this.datedepot = datedepot;
	}
	 
	
	

	
	
	
	
	
	

}
