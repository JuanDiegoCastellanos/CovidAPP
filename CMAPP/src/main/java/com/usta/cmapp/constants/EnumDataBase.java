package com.usta.cmapp.constants;

/**
 * Contiene los valores constantes que jamás van a cambiar en la aplicación
 * 
 * @author Juan Caste
 *
 */

public enum EnumDataBase {

	MYSQL(1, "Msql"), POSTGRESQL(2, "Postgres");

	private int id;
	private String description;

	private EnumDataBase(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
