package co.nomina.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import co.nomina.entities.Empleado;
import co.nomina.model.EmpleadoDAO;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e=new Empleado();
		e.setCodigo("51317");
		e.setCedula("1090467826");
		e.setNombre("Raphael");
		String nac="1993-09-06";
		String ingr="2018-06-06";
		String ret="2020-09-09";
		
		SimpleDateFormat parseDate = new SimpleDateFormat("yyyy/MM/dd");
		
		Date fechanacimiento;
		try {
			fechanacimiento = (Date)parseDate.parse(nac);
			e.setFechanacimiento(fechanacimiento);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Date fechaingreso;
		try {
			fechaingreso = (Date)parseDate.parse(ingr);
			e.setFechaingreso(fechaingreso);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Date fecharetiro;
		try {
			fecharetiro = (Date)parseDate.parse(ret);
			e.setFecharetiro(fecharetiro);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		EmpleadoDAO eDAO=new EmpleadoDAO();
		eDAO.insert(e);

	}

}
