<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<br>
	<h4 style="color:red">${mess}</h4>
	<h2>Welcome !</h2>
	<form action="connection" method="post">
		<label>Login</label> <input type="text" name="login"><br>
		<br> <label>Password</label> <input type="password"
			name="password"><br>
		<br> <input type="submit" value="Envoyer">
	</form>





</body>
</html>