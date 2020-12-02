package br.com.rf.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rf.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
