package co.nomina.model;

import co.nomina.entities.Empleado;
import co.nomina.util.Conexion;

public class EmpleadoDAO 
extends Conexion<Empleado> 
implements GenericDao<Empleado> {

	public EmpleadoDAO() {
		super(Empleado.class);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoDAO(Class<Empleado> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	
	/*public void listarEmpleado() {
		Empleado resultList = em.createQuery(
				"SELECT * FROM empleado WHERE"+, Empleado.class).getResultList();
		System.out.println("num of employess:" + resultList.size());
		for (Empleado next : resultList) {
			System.out.println("next employee: " + next);
	   }
	}*/
	

}
