<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>View of Clients</title>
</head>
<body>
	Table of Clients
	<form:form name="ClientList">
	<table border="1px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact Info</th>
			<th>address</th>
			<th>Action</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${clientList}" var="client">
			<tr>
				<td>
					<input type="hidden" name="id" value="${client.id}" />
					${client.id}
				</td>
				<td>${client.name} </td>
				<td>${client.contactInfo}</td>
				<td>${client.address}</td>
				
				<td><input type="button" value="Resumes" onClick="resumeList(${client.id});"/></td>
				<td><input type="button" value="Edit" onClick="editClient(${client.id});"/></td>
				<td><input type="button" value="Delete" onClick="deleteClient(${client.id});"/></td>
				
			</tr>
		</c:forEach>	
	</table>
	<div><font color="#ff0000">${message}</font></div>
</form:form>
</body>
</html>
