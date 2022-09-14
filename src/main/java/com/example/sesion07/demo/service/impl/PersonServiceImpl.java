package com.example.sesion07.demo.service.impl;

import com.example.sesion07.demo.model.Person;
import com.example.sesion07.demo.service.PersonService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	private static List<Person> listPerson = new ArrayList<Person>();

	@Override
	public List<Person> list() {
		return listPerson;
	}

	@Override
	public void save(Person person) {
		listPerson.add(person);
	}

}
