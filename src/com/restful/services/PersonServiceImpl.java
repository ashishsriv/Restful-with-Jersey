package com.restful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.restful.dao.PersonDAO;
import com.restful.domain.Person;

public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDao;

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	public PersonDAO getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDAO personDao) {
		this.personDao = personDao;
	}

	@Override
	@Transactional
	public Person findPerson(Integer id) {
		return personDao.findPerson(id);
	}

}
