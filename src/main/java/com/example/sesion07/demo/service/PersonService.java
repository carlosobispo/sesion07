package com.example.sesion07.demo.service;

import java.util.List;

import com.example.sesion07.demo.model.Person;

public interface PersonService {

	List<Person> list();

	void save(Person person);

}
