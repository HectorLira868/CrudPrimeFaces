package org.modelo.report;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Report implements Serializable{
	private Integer id;
	private String tipo;
	private String folio;
	private String comentario;

	//SUPER CLASS
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	//FIELDS DE TODO
	public Report(Integer id, String tipo, String folio, String comentario) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.folio = folio;
		this.comentario = comentario;
	}

	//GETTERS AND SETTERS DE TODO
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
