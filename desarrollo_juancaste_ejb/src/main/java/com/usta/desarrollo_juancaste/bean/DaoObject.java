package com.usta.desarrollo_juancaste.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mysql.model.Login;
import com.mysql.model.Persona;
import com.usta.desarrollo_juancaste.beans.interfaces.IObjectQueryMysql;

/**
 * 
 * @author Juan Caste
 *
 * @param <T>
 */
@Stateless // Que son los beans
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)

public class DaoObject<T> implements IObjectQueryMysql<T> {

	@PersistenceContext(unitName = "desarrollo_juancaste_mysql") // define el motor de base de datos
	EntityManager mysqlentity;// define los metodos que permiten las transacciones

	@Override
	public void createObject(T t) throws Exception {

		mysqlentity.persist(t);
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> findAll(Class<T> t) throws Exception {

		List<T> object = new ArrayList<T>();
		Query querySql = mysqlentity.createNamedQuery(t.getSimpleName() + ".FIND_ALL");// Contruye la Consulta

		object = querySql.getResultList();// Trae los datos de la consulta

		return object;
	}

	@Override
	public T findById(Integer id, Class<T> object) throws Exception {
		T t = null;
		t = (T) mysqlentity.find(Object.class, id);

		return t;
	}

	@Override
	public void update(T t) throws Exception {
		mysqlentity.merge(t);
	}

	@Override
	public void delete(Integer id, Class<T> object) throws Exception {
		T t = findById(id, object);

		if (t != null) {
			mysqlentity.remove(t);
		}

	}

	@Override
	public T searchUser(String user, String password) throws Exception {
		T l = null;

		Query q = mysqlentity.createNamedQuery(Login.FIND_USER_CREDENTIALS_MYSQL);
		q.setParameter("us", user);
		q.setParameter("ps", password);

		try {
			l = (T) q.getSingleResult();
		} catch (NoResultException e) {
			l = null;
		}

		return l;
	}

	@Override
	public T requiredPassword(String user) throws Exception {

		T t = null;
		Query q = mysqlentity.createNamedQuery(Login.FIND_USER);
		q.setParameter("user", user);
		try {
			t = (T) q.getSingleResult();
		} catch (NoResultException e) {
			t = null;
		}

		return t;
	}
	@Override
	public T searchPersonByDocument(String documento) throws Exception {
		T t = null;
		Query q = mysqlentity.createNamedQuery(Persona.FIND_BY_DOCUMENT);
		q.setParameter("doc", documento);
		try {
			t = (T) q.getSingleResult();
		} catch (Exception e) {
			t = null;
		}
		
		return t;
	}
}
