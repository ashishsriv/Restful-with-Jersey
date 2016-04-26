package com.restful.services;

import java.util.List;

import com.restful.domain.Person;

public interface PersonService {
    void addPerson(Person person);
    Person findPerson (Integer id);

	
}
