package com.restful.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.framework.persistance.GenericDAOImpl;
import com.restful.domain.Person;
 
@Repository
//@Transactional
public class PersonDAOImpl extends GenericDAOImpl<Person>  implements PersonDAO 
{
     
    public void addPerson(Person person) 
    {
    	save(person);
    }



	@Override
	public Person findPerson(Integer id) {
		// TODO Auto-generated method stub
		return find(id);
	}
}