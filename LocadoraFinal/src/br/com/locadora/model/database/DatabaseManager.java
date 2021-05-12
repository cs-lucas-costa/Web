package br.com.locadora.model.database;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import br.com.locadora.model.bean.UserBean;

// Alterando o arquivo
public class DatabaseManager {
	
	public static DatabaseManager dbManager = null;
	
	//MARK:- Singleton class
	private DatabaseManager() {}
	
	//MARK:- Methods
	public static DatabaseManager shared() {
				
		if (dbManager == null) {
			dbManager = new DatabaseManager();
		}
				
		return dbManager;
	}
	
	
	public <T>T select(String table, int id, Class<T> object) {
			
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(table);	
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		T user = manager.find(object, id);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		return user;
	}
	
	public <T>T select(String table, String id, Class<T> object) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(table);	
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		T user = manager.find(object, id);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		return user;
	}
	
	@SuppressWarnings("unchecked")
	public <T>List<T> selectAll(String table) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(table);	
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		List<T> list = manager.createQuery("select c FROM " + table + " c").getResultList();
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		return list;
	}
	
	public <T>boolean insert(T object, String table) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(table);	
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(object);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		return true;
	}
	
	public<T> boolean update(String table, T object) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(table);	
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(object);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		return true;
	}
	
	public <T>void delete(String table, int id, Class<T> object) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(table);
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		T user = manager.find(object, id);
		manager.remove(user);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
