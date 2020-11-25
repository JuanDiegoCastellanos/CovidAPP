package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the registros database table.
 * 
 */
@Entity
@Table(name="registros")
//@NamedQuery(name="Registro.findAll", query="SELECT r FROM Registro r")
public class Registro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Registro.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_registro")
	private Integer idRegistro;

	@Column(name="fecha_ingreso")
	private Timestamp fechaIngreso;

	@Column(name="fecha_salida")
	private Timestamp fechaSalida;

	@Column(name="id_empresa")
	private Integer idEmpresa;

	@Column(name="id_enfermedad")
	private Integer idEnfermedad;

	@Column(name="id_persona")
	private Integer idPersona;

	@Column(name="ingreso")
	private Boolean ingreso;

	@Column(name="sintomas")
	private Boolean sintomas;

	@Column(name="temperatura")
	private Integer temperatura;

	public Registro() {
	}

	public Integer getIdRegistro() {
		return this.idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Timestamp getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Timestamp fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Timestamp getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Timestamp fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(Integer idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Boolean getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(Boolean ingreso) {
		this.ingreso = ingreso;
	}

	public Boolean getSintomas() {
		return this.sintomas;
	}

	public void setSintomas(Boolean sintomas) {
		this.sintomas = sintomas;
	}

	public Integer getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}

}