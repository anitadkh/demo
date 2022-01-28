<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL : Expression language</title>
</head>
<body>
<jsp:useBean id="emp" class="fr.formation.inti.entity.Employee"></jsp:useBean>
<h2>Hello : </h2>

<jsp:setProperty property="firstName" name="emp" value="Anita"/>
<jsp:setProperty property="lastName" name="emp" value="DEK"/>

<h1>Hello ${emp.firstName} ${emp.lastName}</h1>
<%-- <%= request.getParameter("firstName") %> --%>
<%-- <h1>Hello ${firstName } ${lastName }</h1> --%>

<br>
	<form action ="emp" method=Post>
		<label>FirstName</label>
		<input type="text" name="firstName"><br><br>
		<label>LastName</label>
		<input type="text" name="lastName"><br><br>
		
		<input type="submit" value="Say hello">
	</form>
	
	<h1>${message} ${firstName } ${lastName }</h1>
	<h3>${message}  ${employee.firstName }</h3>




</body>
</html>