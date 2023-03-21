package com.cubeit.testapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.cubeit.testapi.models.Projet;
import com.cubeit.testapi.models.Tache;
import com.cubeit.testapi.models.TestProjet;
import com.cubeit.testapi.repositories.ProjetRepository;
import com.cubeit.testapi.repositories.TacheRepository;
import com.cubeit.testapi.repositories.TestRepository;

@SpringBootApplication
public class TestapiApplication implements CommandLineRunner{

	
	private static final Logger logger = LoggerFactory.getLogger(TestapiApplication.class);
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	

	private final TestRepository testRepository;

	
	private final ProjetRepository projetRepository;

	private final TacheRepository tacheRepository;
	
	@Autowired
	public TestapiApplication(TacheRepository tacheRepository, ProjetRepository projetRepository, TestRepository testRepository ) {
		
		this.tacheRepository=tacheRepository;
		this.projetRepository=projetRepository;
		this.testRepository=testRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		/*Date date=new Date();
		
		Projet p1 = new Projet("pr1/pr2/pr3/pr4",date);
		Projet p2 = new Projet("prs1/prs2/prs3/prsss4",date);
		Projet p3 = new Projet("prxxx1/prxx2/prxx3/prxx4",date);
		Projet p4 = new Projet("pryyyy1/pryyy2/pryy3/pryy4",date);
		
		List<Projet> p_all= new ArrayList<Projet>();
		p_all.add(p1); p_all.add(p2); p_all.add(p3); p_all.add(p4);
		
		Tache ta1 = new Tache("test projet x1","obligatoire",date,"a faire");
		
		projetRepository.saveAll(p_all);
		
		ta1.setProjets(p_all);
		
		tacheRepository.save(ta1);
		*/
		
		
		
		
		Tache ta2 = tacheRepository.findById("6418fa3aafa8802fa65516ef").get();
		
		
		
		System.out.println(ta2.getTest().getNom()+ta2.getTest().getDetails());
		
		
		
		
		
		/*
		System.out.println("###########saving taches###############");
		
		tacheRepository.save(new Tache("authentification","obligatoire",date,"en cours"));
		
		*/

		//logger.info("########### Spring Deleting Taches! ###############");
		//tacheRepository.deleteAll();

		restConfiguration.exposeIdsFor(Tache.class);


		logger.info("########### Spring Start ###############");
		
		
	}
	

}
