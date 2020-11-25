package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipos_documentos database table.
 * 
 */
@Entity
@Table(name="tipos_documentos")
//@NamedQuery(name="TiposDocumento.findAll", query="SELECT t FROM TiposDocumento t")
public class TiposDocumento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "TipoDocumento.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_documento")
	private Integer idTipoDocumento;

	@Column(name="descripcion")
	private String descripcion;

	public TiposDocumento() {
	}

	public Integer getIdTipoDocumento() {
		return this.idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}