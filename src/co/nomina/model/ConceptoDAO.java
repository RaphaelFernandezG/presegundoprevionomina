package co.nomina.model;

import co.nomina.entities.Concepto;
import co.nomina.util.Conexion;

public class ConceptoDAO 
extends Conexion<Concepto> 
implements GenericDao<Concepto> {

	public ConceptoDAO() {
		super(Concepto.class);
		// TODO Auto-generated constructor stub
	}

	public ConceptoDAO(Class<Concepto> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

}
