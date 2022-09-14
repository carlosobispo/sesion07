package com.example.sesion07.demo.controller;

import com.example.sesion07.demo.model.Person;
import com.example.sesion07.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonControlller {

	@Autowired
	PersonService personService;

	@GetMapping("/listAll")
	public Iterable<Person> listAllPersons() {
		return personService.list();
	}

	@PostMapping("/save")
	public long save(@RequestBody Person person) {
		personService.save(person);
		return person.getIdPerson();
	}

}
