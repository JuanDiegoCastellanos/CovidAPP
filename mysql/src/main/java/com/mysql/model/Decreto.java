package com.mysql.model;

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
	private int idDecreto;

	private String descripcion;

	@Column(name="id_historico")
	private int idHistorico;

	@Column(name="numero_decreto")
	private String numeroDecreto;

	public Decreto() {
	}

	public int getIdDecreto() {
		return this.idDecreto;
	}

	public void setIdDecreto(int idDecreto) {
		this.idDecreto = idDecreto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdHistorico() {
		return this.idHistorico;
	}

	public void setIdHistorico(int idHistorico) {
		this.idHistorico = idHistorico;
	}

	public String getNumeroDecreto() {
		return this.numeroDecreto;
	}

	public void setNumeroDecreto(String numeroDecreto) {
		this.numeroDecreto = numeroDecreto;
	}

}