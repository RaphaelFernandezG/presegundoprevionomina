package co.nomina.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codigo;

	private String cedula;

	@Temporal(TemporalType.DATE)
	private Date fechaingreso;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	@Temporal(TemporalType.DATE)
	private Date fecharetiro;

	private String nombre;

	//bi-directional many-to-one association to Liquidacion
	@OneToMany(mappedBy="empleado")
	private List<Liquidacion> liquidacions;

	public Empleado() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFechaingreso() {
		return this.fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Date getFecharetiro() {
		return this.fecharetiro;
	}

	public void setFecharetiro(Date fecharetiro) {
		this.fecharetiro = fecharetiro;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Liquidacion> getLiquidacions() {
		return this.liquidacions;
	}

	public void setLiquidacions(List<Liquidacion> liquidacions) {
		this.liquidacions = liquidacions;
	}

	public Liquidacion addLiquidacion(Liquidacion liquidacion) {
		getLiquidacions().add(liquidacion);
		liquidacion.setEmpleado(this);

		return liquidacion;
	}

	public Liquidacion removeLiquidacion(Liquidacion liquidacion) {
		getLiquidacions().remove(liquidacion);
		liquidacion.setEmpleado(null);

		return liquidacion;
	}

}