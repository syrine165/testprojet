package com.cubeit.testapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cubeit.testapi.models.Tache;
import com.cubeit.testapi.repositories.TacheRepository;
import com.cubeit.testapi.services.interfaces.ITacheService;

@Controller 
public class TacheController {
	
	@Autowired
    private TacheRepository tacheRepository;
	
	

    @GetMapping("/liste-taches")
    public String TachesView(Model model){
    	
    	model.addAttribute("taches", tacheRepository.findAll());
    	
    	model.addAttribute("t", new Tache());
        
 //   	model.addAttribute("taches", tacheRepository.findAll(Sort.by(Sort.Direction.DESC,"id")));
    	
    	return"liste-taches";
    }
    
    @PostMapping("/create-tache")
    public String addTache(@ModelAttribute Tache t, final RedirectAttributes redirectAttributes){
    	
    	tacheRepository.save(t);
    	
    	redirectAttributes.addFlashAttribute("message_ajout","Tache Created Successfully");
    	{
    }
    	
    	return "redirect:/liste-taches";
    }
    
    @GetMapping("/update-tache")
    public String updateTache(@Validated Tache t, final RedirectAttributes redirectAttributes){
    	
    	tacheRepository.save(t);
    	
    	redirectAttributes.addFlashAttribute("message_modifier","Tache Modified Successfully");
    	{
    }
    	
    	return "redirect:/liste-taches";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GetMapping("/delete-tache")
    public String deleteTache(@RequestParam String id, final RedirectAttributes redirectAttributes){
    	
    	tacheRepository.deleteById(id);
    	
    	redirectAttributes.addFlashAttribute("message_delete","Tache Deleted Successfully");
    	{
    }
    	
    	return "redirect:/liste-taches";
    }
}
