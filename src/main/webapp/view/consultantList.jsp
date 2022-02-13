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
<title>View of Consultants</title>
</head>
<body>
	Table of Consultants
	<form:form name="ConsultantList">
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
		<c:forEach items="${consultantList}" var="consultant">
			<tr>
				<td>
					<input type="hidden" name="id" value="${consultant.id}" />
					${consultant.id}
				</td>
				<td>${consultant.name} </td>
				<td>${consultant.contactInfo}</td>
				<td>${consultant.address}</td>
				
				<td><input type="button" value="Resumes" onClick="resumeList(${consultant.id});"/></td>
				<td><input type="button" value="Edit" onClick="editConsultant(${consultant.id});"/></td>
				<td><input type="button" value="Delete" onClick="deleteConsultant(${consultant.id});"/></td>
				
			</tr>
		</c:forEach>	
	</table>
	<div><font color="#ff0000">${message}</font></div>
</form:form>
</body>
</html>


	<!-- ---------------------------------------------------------------------------- -->

<!-- <body link="#0000FF" alink="#0000FF" vlink="#0000FF"> -->

