<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="<%=request.getContextPath()%>/sendform" method="post">
		<label for="nombre">Nombre</label> <input type="text" name="nombre">
		<button type="submit">Enviar</button>
	</form>
	
</body>
</html>