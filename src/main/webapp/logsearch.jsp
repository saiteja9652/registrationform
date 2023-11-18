<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
			<link rel="stylesheet" href="Regproces.css">	

</head>
<body>

		<h1>User Details</h1>
		<h2>User Name:${user.username}</h2>
		<h2>Password:*****</h2>
		<h2>Qualifications: ${user.qualifications}</h2>
		<h2>Gender: ${user.gender}</h2>
		<h2>Technologies:${user.technologies}</h2>
		<h2>Type:${user.type}</h2>
		<h2>Address:${user.address}</h2>
		<h2>Comments:${user.comments}</h2>
		
		<button onclick="window.location.href='Search.html'">Back</button>
		<button onclick="window.location.href='login.html'">LogIn</button>
		<button onclick="window.location.href='Regproces.html'">Register</button>
		
		
	

</body>
</html>