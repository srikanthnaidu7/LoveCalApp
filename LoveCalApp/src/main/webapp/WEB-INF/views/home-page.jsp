<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css"
	integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1 class="text-center">Love Calculator</h1>
	<hr>
	<div align="center">
		<form:form action="process-homepage" method="get"
			modelAttribute="userInfo" cssClass="form-inline">

			<table>
				<tr>
					<td><label for="un"> Enter your Name:</label></td>
					<td><form:input class="form-control" id="un" path="name" /></td>
					<td><form:errors path="name" cssClass="error" /></td>
				</tr>

				<tr>
					<td><label for="cn"> Crush Name: </label></td>
					<td><form:input class="form-control" id="cn" path="crushName" /></td>
				</tr>

				<tr>
					<td align="right"><form:checkbox id="termsCnd"
							path="termsCond" /></td>
					<td>Agree Terms And Conditions</td>
					<td><form:errors path="termsCond" cssClass="error" /></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><button type="submit"
							value="Calculate" class="btn btn-primary">Calculate</button></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>