package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the empresas database table.
 * 
 */
@Entity
@Table(name = "empresas")
//@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Empresa.FIND_ALL";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private Integer idEmpresa;

	@Column(name = "cantidad_empleados")
	private Integer cantidadEmpleados;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "email")
	private String email;

	@Column(name = "nit")
	private BigDecimal nit;

	@Column(name = "nombre_empresa")
	private String nombreEmpresa;

	@Column(name = "numero_verificacion")
	private Integer numeroVerificacion;

	@Column(name = "representante")
	private String representante;
	
	@Column(name = "telefono")
	private BigDecimal telefono;

	public Empresa() {
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getCantidadEmpleados() {
		return this.cantidadEmpleados;
	}

	public void setCantidadEmpleados(Integer cantidadEmpleados) {
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

	public BigDecimal getNit() {
		return this.nit;
	}

	public void setNit(BigDecimal nit) {
		this.nit = nit;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Integer getNumeroVerificacion() {
		return this.numeroVerificacion;
	}

	public void setNumeroVerificacion(Integer numeroVerificacion) {
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