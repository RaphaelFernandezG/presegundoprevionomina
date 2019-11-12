package co.nomina.model;

import co.nomina.entities.Tipoconcepto;
import co.nomina.util.Conexion;

public class TipoconceptoDAO extends Conexion<Tipoconcepto> implements GenericDao<Tipoconcepto> {

	public TipoconceptoDAO() {
		super(Tipoconcepto.class);
		// TODO Auto-generated constructor stub
	}

	public TipoconceptoDAO(Class<Tipoconcepto> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

}
