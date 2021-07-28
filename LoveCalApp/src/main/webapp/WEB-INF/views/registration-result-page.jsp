<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<h1 align="left">Your Registration is successful</h1>
<h4 align="left">The details entered by you are:</h4>

<p>Name : ${registrationInfo.name}</p>
<p>User Name: ${registrationInfo.userName}</p>
<p>Password : ${registrationInfo.password}</p>
<p>Country : ${registrationInfo.country}</p>
<p>Hobbies : 
	<c:forEach  var = "hobbie" items = "${registrationInfo.hobbies}">
	    <c:out value = "${hobbie}"/>
	</c:forEach>
</p>
<p>Gender : ${registrationInfo.gender}</p>
<p>Age : ${registrationInfo.age}</p>

<p>Email : ${registrationInfo.communicationDTO.email}</p>

<p>Phone : ${registrationInfo.communicationDTO.phone}</p>
</body>
</html>