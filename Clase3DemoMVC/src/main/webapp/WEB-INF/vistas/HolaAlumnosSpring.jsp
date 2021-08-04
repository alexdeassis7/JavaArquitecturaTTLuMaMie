<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- utilizamos los jsp tag -->
	Hola ${param.nombre }. welcome to mvc
	
	<br>
	el siguiente mensaje estaba en el modelo !
	
	,este fue seteado mediante "addAtribute()";
	${mensaje }


</body>
</html>

