<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Locadora</title>
<link href="css/loginStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form id="login" action="login" method="post">
		<div align="center">
			<h3>
				Login MovCars
			</h3>
			<div class="inputs">
				<input type="text" name="username" required="required" pattern="[A-Za-z0-9]{1,20}" placeholder="username">
			</div>
			<div class="inputs">
				<input type="password" name="password" required="required" pattern="[A-Za-z0-9]{1,20}" placeholder="password">
			</div>
			<button id="sign" type="submit"> SIGN IN</button>
		</div>
	</form>
</body>
</html>