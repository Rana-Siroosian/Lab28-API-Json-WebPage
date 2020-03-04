<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />

</head>
<body>
	<main class="container">
		<form action="/weather">
			<section class="jumbotron">
				<h2>Please Enter the Latitude and Longitude</h2>
			</section>
			<section class="jumbotron">
				<span class="ex1">Latitude:<br><input type="text" name="latitude"><br>Longtitude:<br><input type="text" name="longitude"></label>

			</section>
			<button type="submit" class="btn btn-warning">Submit</button>

		</form>

	</main>
</body>
</html>