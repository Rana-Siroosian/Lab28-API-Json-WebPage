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
		<form action="/">
			<section class="jumbotron">

				<h2>${location }</h2>
			</section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Day</th>
						<th>Weather</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="wea" items="${weather }">

						<tr>
							<td>${ wea.day }</td>
							<td>${wea.weatherStatus }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>


			<button type="submit" class="btn btn-warning">Home Page</button>
		</form>
	</main>
</body>
</html>