package co.nomina.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipoconcepto database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoconcepto.findAll", query="SELECT t FROM Tipoconcepto t")
public class Tipoconcepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Concepto
	@OneToMany(mappedBy="tipoconcepto")
	private List<Concepto> conceptos;

	public Tipoconcepto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Concepto> getConceptos() {
		return this.conceptos;
	}

	public void setConceptos(List<Concepto> conceptos) {
		this.conceptos = conceptos;
	}

	public Concepto addConcepto(Concepto concepto) {
		getConceptos().add(concepto);
		concepto.setTipoconcepto(this);

		return concepto;
	}

	public Concepto removeConcepto(Concepto concepto) {
		getConceptos().remove(concepto);
		concepto.setTipoconcepto(null);

		return concepto;
	}

}