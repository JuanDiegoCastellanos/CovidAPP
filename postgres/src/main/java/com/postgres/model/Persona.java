package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
//@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Persona.FIND_All";
	public static final String FIND_BY_DOCUMENT= "Persona.FIND_BY_DOCUMENT";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_persona")
	private Integer idPersona;
	
	@Column(name="documento")
	private String documento;

	@Column(name="email")
	private String email;
	
	@Column(name="estatura")
	private Integer estatura;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name="genero")
	private Integer genero;

	@Column(name="grupo_sangineo")
	private String grupoSangineo;

	@Column(name="lugar_nacimiento")
	private Integer lugarNacimiento;

	@Column(name="peso")
	private Integer peso;

	@Column(name="primer_apellido")
	private String primerApellido;

	@Column(name="primer_nombre")
	private String primerNombre;

	@Column(name="segundo_apellido")
	private String segundoApellido;

	@Column(name="segundo_nombre")
	private String segundoNombre;
	
	@Column(name="telefono")
	private BigDecimal telefono;

	@Column(name="tipo_documento")
	private Integer tipoDocumento;

	public Persona() {
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEstatura() {
		return this.estatura;
	}

	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getGenero() {
		return this.genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public String getGrupoSangineo() {
		return this.grupoSangineo;
	}

	public void setGrupoSangineo(String grupoSangineo) {
		this.grupoSangineo = grupoSangineo;
	}

	public Integer getLugarNacimiento() {
		return this.lugarNacimiento;
	}

	public void setLugarNacimiento(Integer lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public Integer getPeso() {
		return this.peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public BigDecimal getTelefono() {
		return this.telefono;
	}

	public void setTelefono(BigDecimal telefono) {
		this.telefono = telefono;
	}

	public Integer getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}