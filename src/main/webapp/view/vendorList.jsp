<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>

		<!--<script language="javaScript">
			function deleteStudent(id)
			{
			
				document.getElementsByName("id")[0].value=id;
			
				document.showInfo.action="deleteemployee.html";
				document.showInfo.submit();
			}
			function editStudent(id)
			{
			
				document.getElementsByName("id")[0].value=id;
			
				document.showInfo.action="editemployee.html";
				document.showInfo.submit();
			}
		</script>-->
<meta charset="ISO-8859-1">
<title>Vendor List</title>
</head>
<body>
	Table of Vendor
	<form:form name="ClientList">
	<table border="1px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact Info</th>
			<th>address</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${vendorList}" var="vendor">
			<tr>
				<td>
					<input type="hidden" name="id" value="${vendor.id}" />
					${vendor.id}
				</td>
				<td>${vendor.name} </td>
				<td>${vendor.contactInfo}</td>
				<td>${vendor.address}</td>
				
				
				<td><input type="button" value="Edit" onClick="editClient(${vendor.id});"/></td>
				<td><input type="button" value="Delete" onClick="deleteClient(${vendor.id});"/></td>
				
			</tr>
		</c:forEach>	
	</table>
	<div><font color="#ff0000">${message}</font></div>
</form:form>
</body>
</html>