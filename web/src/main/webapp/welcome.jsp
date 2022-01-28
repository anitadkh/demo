<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="emp" class="fr.formation.inti.entity.Employee"></jsp:useBean>
	<jsp:setProperty property="firstName" name="emp" />
	<jsp:setProperty property="lastName" name="emp" />


	<h1>Hello ${firstName} ${lastName}</h1>

	<form action="connection" method="post">
		<input type="submit" value="Logout" name="logout" />

	</form>

</body>
</html>