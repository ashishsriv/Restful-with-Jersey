package com.restful.dao;

import com.restful.domain.Person;

public interface PersonDAO {
//    public List<Person> getAllPersons();
    public void addPerson(Person person);
    public Person findPerson(Integer id);

}
