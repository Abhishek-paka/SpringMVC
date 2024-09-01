<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	height: 100vh;
	margin: 0;
}

form {
	background-color: #fff;
	padding: 30px 40px;
	border-radius: 8px;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

form h1 {
	color: #333;
	margin-bottom: 20px;
}

label {
	display: block;
	margin-bottom: 10px;
	color: #666;
	text-align: left;
}

input[type="email"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

button {
	width: 100%;
	padding: 10px;
	background-color: #4CAF50;
	border: none;
	color: white;
	font-size: 16px;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #45a049;
}

.message {
	margin-top: 20px;
	font-size: 18px;
	color: green;
	text-align: center;
	width: 100%;
}
</style>
</head>
<body>

	<form action="loginAction">
		<h1>Customer Login</h1>
		<label for="username"> Email : <input type="email" name="userName"> </label> <br> 
		<label for="password" > Password : <input type="password" name="password"> </label> <br>
		<button type="submit">Login</button>
	</form>
	
	<%
		String message = (String) request.getAttribute("Message");
		if (message != null){
	%>
		<h1 class="message"><%=message%></h1>
	<%
		}
	%>
	
</body>
</html>
