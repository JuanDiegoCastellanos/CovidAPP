package com.usta.desarrollo_juancaste.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.mysql.model.Login;
import com.usta.desarrollo_juancaste.bean.DaoObject;
import com.usta.desarrollo_juancaste.bean.DaoObjectPostgresql;
import com.usta.desarrollo_juancaste.beans.interfaces.IObjectQueryMysql;
import com.usta.desarrollo_juancaste.beans.interfaces.IObjectQueryPostgres;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ServicesDao<T> {

	@EJB
	IObjectQueryMysql<T> mysqlDao;

	@EJB
	IObjectQueryPostgres<T> postgresDao;

	public void createObject(T t, int db) throws Exception {

		switch (db) {
		case 1:// MYSQL
			mysqlDao.createObject(t);

			break;

		case 2:// POSTGRES
			postgresDao.createObject(t);
			break;
		}

	}

	public List<T> findAll(T t, int db) throws Exception {

		List<T> object = new ArrayList<T>();

		switch (db) {
		case 1:// MYSQL
			object = mysqlDao.findAll((Class<T>) t);

			break;

		case 2:// POSTGRES

			object = postgresDao.findAll((Class<T>) t);
			break;
		}
		return object;

	}

	public T findById(Integer id, Class<T> object, int db) throws Exception {

		T obj = null;
		switch (db) {
		case 1:// MYSQL
			obj = mysqlDao.findById(id, object);

			break;

		case 2:// POSTGRES
			obj = postgresDao.findById(id, object);
			break;
		}
		return obj;

	}

	public void update(T t, int db) throws Exception {

		switch (db) {
		case 1:// MYSQL
			mysqlDao.update(t);
			break;

		case 2:// POSTGRES
			postgresDao.update(t);
			break;
		}

	}

	public void delete(Integer id, Class<T> object, int db) throws Exception {

		switch (db) {
		case 1:// MYSQL
			mysqlDao.delete(id, object);
			break;

		case 2:// POSTGRES
			postgresDao.delete(id, object);
			break;
		}

	}
	
	public T searchUser(String user, String password, int bd) throws Exception
	{
		T t = null;
		switch (bd) {
		case 1:
			t = mysqlDao.searchUser(user, password);
			break;
		case 2: 
			t = postgresDao.searchUser(user, password);
			break;
		}
		return t;
		
	}
	
	/**
	 * Metodo para buscar el usuario para retornar su clave 
	 * @return
	 * @throws Exception
	 */
	public T searchUser(String user, int bd) throws Exception{
		T t= null;
		switch (bd) {
		case 1:
			t= mysqlDao.requiredPassword(user);
			break;

		case 2:
			t= postgresDao.requiredPassword(user);
			break;
		}
		
		return t;
	}
	public T searchPersonByDocument(String document, int bd) throws Exception{
		T t = null;
		switch (bd) {
			case 1:
				t = mysqlDao.searchPersonByDocument(document);
				break;
				
			case 2:
				t = postgresDao.searchPersonByDocument(document);
				break;
		}
		return t;
	}

}
