<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
	<%float result = (float) request.getAttribute("result");%>
	<h1>
		Resultado - <%=result%>
	</h1>
</body>
</html> 