<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

</head>
<h1 align="center">Love Calculator</h1>
<hr>
<h1>Hi ${name}</h1>
<h2>Send your result to your Email</h2>
<body>
<div align="center">
		<form:form action="process-email" method="GET"
			modelAttribute="emailDTO" cssClass="form-inline">
			<table>
				<tr>
					<td><label for="mail"> Enter Your Email: </label></td>
					<td><form:input class="form-control" id="mail" path="userEmail" /></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><button type="submit"
							value="Send" class="btn btn-primary">Send</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>