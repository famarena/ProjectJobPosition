package it.cegeka.curricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.cegeka.entities.Candidate;
import it.cegeka.repository.CandidateRepository;



@Controller    
@RequestMapping(path="/candidate") 
public class CandidateController {
	@Autowired
	private CandidateRepository candidateRepository;
	@GetMapping(path="/all")
	public @ResponseBody String getAllUsers() {
		// This returns a JSON or XML with the users
		
		return "all";
	}
	
	@GetMapping(path="/new")
	public @ResponseBody String createUser() {
		// This returns a JSON or XML with the users
		Candidate c = new Candidate();
		c.setAge(14);
		c.setName("Camill");
		return "ciao";
	}
}