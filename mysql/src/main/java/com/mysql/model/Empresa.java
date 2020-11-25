package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the empresas database table.
 * 
 */
@Entity
@Table(name="empresas")
//@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Empresa.FIND_ALL";
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa")
	private int idEmpresa;

	@Column(name="cantidad_empleados")
	private int cantidadEmpleados;

	private String direccion;

	private String email;

	@Column(name="nit_number")
	private int nitNumber;

	private String nombre;

	@Column(name="numero_verificacion")
	private int numeroVerificacion;

	private String representante;

	private BigDecimal telefono;

	public Empresa() {
	}

	public int getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getCantidadEmpleados() {
		return this.cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNitNumber() {
		return this.nitNumber;
	}

	public void setNitNumber(int nitNumber) {
		this.nitNumber = nitNumber;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroVerificacion() {
		return this.numeroVerificacion;
	}

	public void setNumeroVerificacion(int numeroVerificacion) {
		this.numeroVerificacion = numeroVerificacion;
	}

	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public BigDecimal getTelefono() {
		return this.telefono;
	}

	public void setTelefono(BigDecimal telefono) {
		this.telefono = telefono;
	}

}