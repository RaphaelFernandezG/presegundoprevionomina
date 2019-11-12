package co.nomina.model;

import co.nomina.entities.Tercero;
import co.nomina.util.Conexion;

public class TerceroDAO extends Conexion<Tercero> implements GenericDao<Tercero> {

	public TerceroDAO() {
		super(Tercero.class);
		// TODO Auto-generated constructor stub
	}

	public TerceroDAO(Class<Tercero> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

}
