package br.com.locadora.model.database;

import java.util.List;

public interface ObjectDAO<T> {
	
	T fetchId(String id);
	List<T>fetchAll();
	boolean update(T object);
	boolean create(T object);
	
}
