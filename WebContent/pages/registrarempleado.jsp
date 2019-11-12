<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Registro Empleado</title>
	<!--Made with love by Mutiullah Samim -->
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>REGISTRO DE EMPLEADOS</h3>
				</div>
				<div class="card-body">
					<form action="../EmpleadoController" method="post">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input id="codigo" name="codigo" type="text" class="form-control" placeholder="Codigo" required>
						</div>
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input id="cedula" name="cedula" type="text" class="form-control" placeholder="Cedula">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input id="nombre" name="nombre" type="text" class="form-control" placeholder="Nombre">
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<input type="text" value="Fecha Nacimiento" readonly>
							</div>
							<input id="fechanacimiento" name="fechanacimiento" type="date" class="form-control">
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<input type="text" value="Fecha Ingreso" readonly>
							</div>
							<input id="fechaingreso" name="fechaingreso" type="date" class="form-control">
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<input type="text" value="Fecha Retiro" readonly>
							</div>
							<input id="fecharetiro" name="fecharetiro" type="date" class="form-control">
						</div>

						<div class="form-group">
							<input type="submit" id="registrar" value="Registrar" class="btn float-left login_btn">
						</div>
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