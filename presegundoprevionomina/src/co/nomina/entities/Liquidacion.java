package co.nomina.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the liquidacion database table.
 * 
 */
@Entity
@NamedQuery(name="Liquidacion.findAll", query="SELECT l FROM Liquidacion l")
public class Liquidacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int codmodelo;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal valor;

	//bi-directional many-to-one association to Proceso
	@ManyToOne
	@JoinColumn(name="numproceso")
	private Proceso proceso;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="codempleado")
	private Empleado empleado;

	//bi-directional many-to-one association to Concepto
	@ManyToOne
	@JoinColumn(name="codconcepto")
	private Concepto concepto;

	public Liquidacion() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodmodelo() {
		return this.codmodelo;
	}

	public void setCodmodelo(int codmodelo) {
		this.codmodelo = codmodelo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Proceso getProceso() {
		return this.proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Concepto getConcepto() {
		return this.concepto;
	}

	public void setConcepto(Concepto concepto) {
		this.concepto = concepto;
	}

}