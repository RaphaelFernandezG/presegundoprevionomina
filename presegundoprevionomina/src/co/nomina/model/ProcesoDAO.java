package co.nomina.model;

import co.nomina.entities.Proceso;
import co.nomina.util.Conexion;

public class ProcesoDAO 
extends Conexion<Proceso> 
implements GenericDao<Proceso> {

	public ProcesoDAO() {
		super(Proceso.class);
		// TODO Auto-generated constructor stub
	}

	public ProcesoDAO(Class<Proceso> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

}
