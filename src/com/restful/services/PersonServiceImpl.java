package com.restful.services;

import org.springframework.transaction.annotation.Transactional;

import com.restful.dao.PersonDAO;
import com.restful.domain.Person;

public class PersonServiceImpl implements PersonService {

	private PersonDAO personDao;

	@Override
	@Transactional
	public void addPerson(Person person) {
		personDao.addPerson(person);
	}

	public PersonDAO getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDAO personDao) {
		this.personDao = personDao;
	}

	@Override
	public Person findPerson(Integer id) {
		return personDao.findPerson(id);
	}

}
