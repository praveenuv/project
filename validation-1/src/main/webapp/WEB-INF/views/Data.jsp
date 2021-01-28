<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>

<head>   
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO PRODUCT DATA</h3>
	<table>
		<tr>
			<th>name</th>
			<th>email</th>
			<th>password</th>
			<th>birthday</th>
			<th>gender</th>
			<th>profession</th>
			<th>married</th>
			<th colspan=2>note</th>
		</tr>

		<c:forEach var="ob" items="${list}" >
			<tr>
				<td><c:out value="${ob.name}" /></td>
				<td><c:out value="${ob.email}" /></td>
				<td><c:out value="${ob.password}" /></td>
				<td><c:out value="${ob.birthday}" /></td>
				<td><c:out value="${ob.gender}" /></td>
				<td><c:out value="${ob.profession}" /></td>
				<td><c:out value="${ob.married}" /></td>
				<td><c:out value="${ob.note}" /></td>

				<td>
				<a href="delete?id=${ob.id}">DELETE</a>
				<a href="edit?id=${ob.id}">EDIT</a>
				</td>	
			</tr>
		</c:forEach>
		</table>
		</body>
</html>


