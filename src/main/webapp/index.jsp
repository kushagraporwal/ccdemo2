<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello to demo app.</h1>
<form action="fetching" method="post">
					<label for="chk" aria-hidden="true">Login</label>
					<input type="text" name="uname" placeholder="Username" required="">
					<input type="password" name="pass" placeholder="Password" required="">
					<button type="submit">Login</button>
				</form>
</body>
</html>