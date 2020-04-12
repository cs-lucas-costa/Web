<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/LoginViewStyle.css">
<title>Login</title>
</head>
<body>
	<div class="container center_div">
		<form class="form-horizontal" action="login" method="post">
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-1">
					<label for="email">Email</label>
					<input type="email" class="form-control" name="email" placeholder="Enter email" required="required">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-1">
					<label for="password">Password</label>
					<input type="password" class="form-control" name="password" placeholder="Enter password" required="required">
				</div>
			</div>
			<div class="form-group">
				<div class="text-center">
					<button type="submit" name="login" class="btn btn-primary">Sign in</button>
					<button type="submit" name="create" class="btn btn-default">Create</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>