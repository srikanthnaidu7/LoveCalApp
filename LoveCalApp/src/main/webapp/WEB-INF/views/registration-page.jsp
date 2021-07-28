<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
	<form:form action="process-registration-page" method="get"
		modelAttribute="registrationInfo" class="form-inline">
		<div class="text-center" class="form-group">
			<p>

				<label for="name"> Name:</label>
				<form:input class="form-control" id="name" path="name"/>
				<form:errors path="name" cssClass="error" />
			</p>

			<p>
				<label for="userName"> User Name:</label>
				<form:input class="form-control" id="userName" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>

			<p>
				<label for="password"> Password:</label>
				<form:password id="password" class="form-control" path="password" />
			</p>

			<p>
				<label for="country"> Country:</label>
				<form:select path="country" class="form-control">
					<form:option selected="selected" value="IND" label="India" />
					<form:option value="DEU" label="Germany" />
					<form:option value="CHN" label="China" />
					<form:option value="US" label="United States" />
				</form:select>
			</p>

			<p>
				<label for="hobbies"> Hobbies:</label>
				<form:checkbox path="hobbies" value="Badmintion" />
				Badmintion
				<form:checkbox path="hobbies" value="Reading" />
				Reading
				<form:checkbox path="hobbies" value="Travelling" />
				Travelling
				<form:checkbox path="hobbies" value="Cricket" />
				Cricket
				<form:checkbox path="hobbies" value="Chess" />
				Chess
			</p>

			<p>
				<label for="gender"> Gender:</label>
				<form:radiobutton path="gender" value="Male" />
				Male
				<form:radiobutton path="gender" value="Female" />
				Female
			</p>
			
			<p>
			<label for="age"> Age:</label>
			<form:input class="form-control" id="age" path="age" />
			<form:errors path="age" cssClass="error" />
			</p>
			
			<h1 class="text-center">Communicaiton</h1>
			<p>
			<label for="email"> Email:</label>
			<form:input class="form-control" id="email" path="communicationDTO.email" />
			<form:errors path="communicationDTO.email" cssClass="error" />
			</p>
			
			<p>
			<label for="phone"> Phone:</label>
			<form:input class="form-control" id="phone" path="communicationDTO.phone" />
			</p>
			
			

			
			<button type="submit" value="Register" class="btn btn-primary">Register</button>
		</div>
	</form:form>
</body>
</html>