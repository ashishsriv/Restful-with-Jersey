package com.framework.persistance;

import java.util.List;

public interface GenericDAO<T> {
	  public T save(T emp);
	    public Boolean delete(T emp);
	    public T edit(T emp);
	    public T find(Integer empId);
}