package com.example.sesion07.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sesion07.demo.model.Person;
import com.example.sesion07.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	static List<Person> listPerson = new ArrayList<Person>();
	
	@Override
	public List<Person> list() {
		return listPerson;
	}

	@Override
	public void save(Person person) {
		listPerson.add(person);
	}
	
	

}
