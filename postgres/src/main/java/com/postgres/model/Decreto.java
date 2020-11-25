package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the decretos database table.
 * 
 */
@Entity
@Table(name="decretos")
//@NamedQuery(name="Decreto.findAll", query="SELECT d FROM Decreto d")
public class Decreto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Decreto.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_decreto")
	private Integer idDecreto;

	@Column(name="descripcio")
	private String descripcio;

	@Column(name="numero_decreto")
	private String numeroDecreto;

	public Decreto() {
	}

	public Integer getIdDecreto() {
		return this.idDecreto;
	}

	public void setIdDecreto(Integer idDecreto) {
		this.idDecreto = idDecreto;
	}

	public String getDescripcio() {
		return this.descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public String getNumeroDecreto() {
		return this.numeroDecreto;
	}

	public void setNumeroDecreto(String numeroDecreto) {
		this.numeroDecreto = numeroDecreto;
	}

}