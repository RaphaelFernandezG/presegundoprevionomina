<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Bucar Empleado</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>
<body>
	<div class="container">
	<jsp:useBean id="nDAO" class="co.nomina.model.EmpleadoDAO"></jsp:useBean>
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>BUSCAR EMPLEADOS</h3>
				</div>
				<div class="card-body">
					<form">
						<table class="table mb-5 table-hover">
						<thead class='bg-light'>
						<th scope='col' class='border-0 text-primary text-center text-uppercase'>Cedula</th>
						<th scope='col' class='border-0 text-primary text-center text-uppercase'>Nombre</th>
						<th scope='col' class='border-0 text-primary text-center text-uppercase'>Fecha Nacimiento</th>
						<th scope='col' class='border-0 text-primary text-center text-uppercase'>Fecha Inicio</th>
						<th scope='col' class='border-0 text-primary text-center text-uppercase'>Fecha Retiro</th>
						</thead>
						<tbody>
						<tr>
						<td class="text-center font-weight-light"><c:out value="${empleado.cedula}"/></td>
						<td class="text-center font-weight-light"><c:out value="${empleado.nombre}"/></td>
						<td class="text-center font-weight-light"><c:out value="${empleado.fechanacimiento}"/></td>
						<td class="text-center font-weight-light"><c:out value="${empleado.fechaingreso}"/></td>
						<td class="text-center font-weight-light"><c:out value="${empleado.fecharetiro}"/></td>
						
						</tr>
						
						
						
						</tbody>
						
						</table>
					</form>
					<div class="form-group">
						<a href="../index.jsp"><input type="button" id="volver" value="Volver" class="btn float-left login_btn"></a>
					</div>
				</div>				
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"  crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>