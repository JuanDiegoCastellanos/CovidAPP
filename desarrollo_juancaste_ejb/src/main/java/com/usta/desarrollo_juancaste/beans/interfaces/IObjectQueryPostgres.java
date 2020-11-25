package com.usta.desarrollo_juancaste.beans.interfaces;

import java.util.List;

import javax.ejb.Remote;



/**
 * Interfaz de tipo Bean que se encarga de recibir los metodos para hacer el
 * crud
 * 
 * @author Juan Caste
 * @param <T> Tipo de objecto que recibe
 */

@Remote

public interface IObjectQueryPostgres<T> {

	/**
	 * Metodo que se encarga de crear el objeto a persistir
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void createObject(T t) throws Exception;

	/**
	 * Metodo encargado de buscar y listar todos los objetos de la consulta deseada
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<T> findAll(Class<T> t) throws Exception;

	/**
	 * Metodo de encontrar por id el objeto buscado
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */

	public T findById(Integer id, Class<T> object) throws Exception;

	/**
	 * Metodo para realizar cualquier cambio o modificación sobre algun dato o
	 * atributod del objeto
	 * 
	 * @param obj
	 * @throws Exception
	 */
	public void update(T t) throws Exception;

	/**
	 * Elimina un objeto dependiendo del id a borrar
	 * 
	 * @param id
	 * @throws Exception
	 */

	public void delete(Integer id, Class<T> object) throws Exception;

	/**
	 * 
	 * 
	 * @param Busca el user segun credenciales
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public T searchUser(String user, String password) throws Exception;
	
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public T requiredPassword(String user )throws Exception;

	/**
	 * busca persona por el numero de documento
	 * @param documento
	 * @return
	 * @throws Exception
	 */
	public T searchPersonByDocument(String documento) throws Exception;
}
