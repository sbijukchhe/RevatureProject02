<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error{
	color:red
}
</style>
</head>
<body>

<form:form method = "post" action = "save" modelAttribute = "book">
<table>

<tr>
<td> Title(*):</td>
<td> <form:input path = "title" />
<form:errors path = "title" cssClass ="error"/>
 </td>    <!-- book.getTitle -->
</tr>

<tr>
<td> Author :</td>
<td> <form:input path = "author" /> </td>    
</tr>

<tr>
<td> Price :</td>
<td> <form:input path = "price" />
<form:errors path = "price" cssClass ="error"/> </td>    
</tr>

<tr>
<td colspan = 2> <input type = "submit" value = "save"/> </td>    
</tr>



</table>
</form:form>

</body>
</html>