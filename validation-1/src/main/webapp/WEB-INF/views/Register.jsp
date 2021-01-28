<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  



<c:choose>
<c:when test="${'EDIT' eq Mode}">
<input type="submit" value="UPDATE"/>
</c:when>
<c:otherwise>
<input type="submit" value="CREATE"/>
</c:otherwise>
</c:choose>

