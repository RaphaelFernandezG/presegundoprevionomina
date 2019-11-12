package co.nomina.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tercero database table.
 * 
 */
@Entity
@NamedQuery(name="Tercero.findAll", query="SELECT t FROM Tercero t")
public class Tercero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codtercero;

	private String descripcion;

	//bi-directional many-to-one association to Concepto
	@OneToMany(mappedBy="tercero")
	private List<Concepto> conceptos;

	public Tercero() {
	}

	public String getCodtercero() {
		return this.codtercero;
	}

	public void setCodtercero(String codtercero) {
		this.codtercero = codtercero;
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
		concepto.setTercero(this);

		return concepto;
	}

	public Concepto removeConcepto(Concepto concepto) {
		getConceptos().remove(concepto);
		concepto.setTercero(null);

		return concepto;
	}

}