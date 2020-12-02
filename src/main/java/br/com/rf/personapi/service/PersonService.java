package br.com.rf.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rf.personapi.entity.Person;
import br.com.rf.personapi.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public String createPerson(Person person) {
		Person savePerson = personRepository.save(person);
		return "Created person with ID " + savePerson.getId();
	}
}
