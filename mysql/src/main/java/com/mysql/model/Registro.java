package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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
	@Column(name="id_persona_empresa")
	private int idPersonaEmpresa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_salida")
	private Date fechaSalida;

	@Column(name="id_empresa")
	private int idEmpresa;

	@Column(name="id_enfermedad")
	private int idEnfermedad;

	@Column(name="id_persona")
	private int idPersona;

	private byte ingreso;

	private byte sintomas;

	private int temperatura;

	public Registro() {
	}

	public int getIdPersonaEmpresa() {
		return this.idPersonaEmpresa;
	}

	public void setIdPersonaEmpresa(int idPersonaEmpresa) {
		this.idPersonaEmpresa = idPersonaEmpresa;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(int idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public int getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public byte getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(byte ingreso) {
		this.ingreso = ingreso;
	}

	public byte getSintomas() {
		return this.sintomas;
	}

	public void setSintomas(byte sintomas) {
		this.sintomas = sintomas;
	}

	public int getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}