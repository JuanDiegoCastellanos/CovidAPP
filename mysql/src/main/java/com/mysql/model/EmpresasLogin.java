package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the empresas_login database table.
 * 
 */
@Entity
@Table(name="empresas_login")
//@NamedQuery(name="EmpresasLogin.findAll", query="SELECT e FROM EmpresasLogin e")
public class EmpresasLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String FIND_ALL = "EmpresasLogin.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa_login")
	private int idEmpresaLogin;

	private int estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_cancelado")
	private Date fechaCancelado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="id_empresa")
	private int idEmpresa;

	@Column(name="id_login")
	private int idLogin;

	public EmpresasLogin() {
	}

	public int getIdEmpresaLogin() {
		return this.idEmpresaLogin;
	}

	public void setIdEmpresaLogin(int idEmpresaLogin) {
		this.idEmpresaLogin = idEmpresaLogin;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFechaCancelado() {
		return this.fechaCancelado;
	}

	public void setFechaCancelado(Date fechaCancelado) {
		this.fechaCancelado = fechaCancelado;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getIdLogin() {
		return this.idLogin;
	}

	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

}