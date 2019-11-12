package co.nomina.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the proceso database table.
 * 
 */
@Entity
@NamedQuery(name="Proceso.findAll", query="SELECT p FROM Proceso p")
public class Proceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	//bi-directional many-to-one association to Liquidacion
	@OneToMany(mappedBy="proceso")
	private List<Liquidacion> liquidacions;

	public Proceso() {
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

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public List<Liquidacion> getLiquidacions() {
		return this.liquidacions;
	}

	public void setLiquidacions(List<Liquidacion> liquidacions) {
		this.liquidacions = liquidacions;
	}

	public Liquidacion addLiquidacion(Liquidacion liquidacion) {
		getLiquidacions().add(liquidacion);
		liquidacion.setProceso(this);

		return liquidacion;
	}

	public Liquidacion removeLiquidacion(Liquidacion liquidacion) {
		getLiquidacions().remove(liquidacion);
		liquidacion.setProceso(null);

		return liquidacion;
	}

}