package co.nomina.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the concepto database table.
 * 
 */
@Entity
@NamedQuery(name="Concepto.findAll", query="SELECT c FROM Concepto c")
public class Concepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codconcepto;

	private String descripcion;

	//bi-directional many-to-one association to Tipoconcepto
	@ManyToOne
	@JoinColumn(name="tipo")
	private Tipoconcepto tipoconcepto;

	//bi-directional many-to-one association to Tercero
	@ManyToOne
	@JoinColumn(name="codtercero")
	private Tercero tercero;

	//bi-directional many-to-one association to Liquidacion
	@OneToMany(mappedBy="concepto")
	private List<Liquidacion> liquidacions;

	public Concepto() {
	}

	public String getCodconcepto() {
		return this.codconcepto;
	}

	public void setCodconcepto(String codconcepto) {
		this.codconcepto = codconcepto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tipoconcepto getTipoconcepto() {
		return this.tipoconcepto;
	}

	public void setTipoconcepto(Tipoconcepto tipoconcepto) {
		this.tipoconcepto = tipoconcepto;
	}

	public Tercero getTercero() {
		return this.tercero;
	}

	public void setTercero(Tercero tercero) {
		this.tercero = tercero;
	}

	public List<Liquidacion> getLiquidacions() {
		return this.liquidacions;
	}

	public void setLiquidacions(List<Liquidacion> liquidacions) {
		this.liquidacions = liquidacions;
	}

	public Liquidacion addLiquidacion(Liquidacion liquidacion) {
		getLiquidacions().add(liquidacion);
		liquidacion.setConcepto(this);

		return liquidacion;
	}

	public Liquidacion removeLiquidacion(Liquidacion liquidacion) {
		getLiquidacions().remove(liquidacion);
		liquidacion.setConcepto(null);

		return liquidacion;
	}

}