package co.nomina.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.nomina.entities.Empleado;
import co.nomina.model.EmpleadoDAO;

/**
 * Servlet implementation class EmpleadoController
 */
@WebServlet("/EmpleadoController")
public class EmpleadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session=request.getSession(true);
		
		String codigo=request.getParameter("codigo");
		String cedula=request.getParameter("cedula");
		String nombre=request.getParameter("nombre");
		String nac=request.getParameter("fechanacimiento");
		String ingr=request.getParameter("fechaingreso");
		String ret=request.getParameter("fecharetiro");
		Empleado e=new Empleado();
		e.setCodigo(request.getParameter("codigo"));
		e.setCedula(cedula);
		e.setNombre(nombre);
		
		SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy");
		
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
		
		response.sendRedirect("./index.jsp");
		
		//request.getRequestDispatcher("/nacionalidadList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
