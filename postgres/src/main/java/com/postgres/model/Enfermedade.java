package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the enfermedades database table.
 * 
 */
@Entity
@Table(name="enfermedades")
//@NamedQuery(name="Enfermedade.findAll", query="SELECT e FROM Enfermedade e")
public class Enfermedade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Enfermedade.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_enfermedad")
	private Integer idEnfermedad;

	@Column(name="descricion")
	private String descricion;

	public Enfermedade() {
	}

	public Integer getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(Integer idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public String getDescricion() {
		return this.descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

}