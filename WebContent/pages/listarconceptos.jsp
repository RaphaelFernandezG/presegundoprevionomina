<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="nDAO" class="co.nomina.model.ConceptoDAO"></jsp:useBean>
<table class="table mb-5 table-hover">
<thead class='bg-light'>
<tr class="table-info">
<th scope='col' class='border-0 text-primary text-center text-uppercase'>Codigo Concepto</th>
<th scope='col' class='border-0 text-primary text-center text-uppercase'>Descripcion Concepto</th>
<th scope='col' class='border-0 text-primary text-center text-uppercase'>Tipo Concepto</th>

</tr>

</thead>
<tbody>
<c:forEach var="n" items="${nDAO.list()}">
<tr>
<td class="text-center font-weight-light"><c:out value="${n.codconcepto}"></td>
<td class="text-center font-weight-light"><c:out value="${n.descripcion}"></td>
<td class="text-center font-weight-light"><c:out value="${n.tipoconcepto.descripcion}"></td>
</tr>



</tbody>
</table>




</body>
</html>