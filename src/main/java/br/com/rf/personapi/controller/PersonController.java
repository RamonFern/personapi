package br.com.rf.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rf.personapi.entity.Person;
import br.com.rf.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	

}
