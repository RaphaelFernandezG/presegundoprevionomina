<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Conceptos</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<jsp:useBean id="nDAO" class="co.nomina.model.ConceptoDAO"
		scope="request"></jsp:useBean>
	<div class="container">
		<table class="table mb-5 table-hover">
			<thead class='bg-light'>
				<tr class="table-info">
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Codigo
						Concepto</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Descripcion
						Concepto</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Tipo
						Concepto</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="n" items="${nDAO.list()}">
					<tr>
						<td class="text-center font-weight-light"><c:out
								value="${n.codconcepto}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${n.descripcion}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${n.tipoconcepto.descripcion}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="form-group">
		<button type="submit" class="btn btn-primary" onclick="location.href='../index.jsp'">Volver</button>
			
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>


</body>
</html>