
package com.example.sesion07.demo.service;

import com.example.sesion07.demo.model.Person;

import java.util.List;

public interface PersonService {

	List<Person> list();

	void save(Person person);

}
