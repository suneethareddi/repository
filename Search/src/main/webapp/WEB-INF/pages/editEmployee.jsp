<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert  here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<h2>Edit Employee Data</h2>

<form:form id="updateForm"  modelAttribute="employ">
<%-- <tr>
<td>Employee Id</td>
<td><input type=text name="empid" value=<%=request.getAttribute("eid")%> readonly="true"></td>
</tr> --%>
<table>
<tr>
<td>Employee Name</td>
<form:input type="hidden" name="id" value="${emp.id}" path="id"/>
<form:errors path="id"/>
<td><form:input type="text" name="empName" path="empName" value="${emp.empName}"/></td>
<form:errors path="empName"/>
</tr>
<tr>
<td>Employee Age</td>
<td><form:input type="text" name="empAge" path="empAge" value="${emp.empAge}"/></td>
<form:errors path="empAge"/>
</tr>
<tr>
<td>Employee Salary</td>
<td><form:input type="text" name="empSalary" path="empSalary" value="${emp.empSalary}"/></td>
<form:errors path="empSalary"/>
</tr>
<tr>
</tr>
<tr>
<td colspan="2"><input type="button" value="submit" onclick="updateMe()"/></td>
</tr>
</table>
</form:form>
<h3 id='status'></h3>

<script>
function updateMe(){
	
	var data=$('#updateForm').serialize();
	
	
	$.ajax({
		
		url : "/Search/user/edit?"+data,
		method : 'PUT',
		success: function(response){
			if(response=='success'){
			$('#status').html("updated successfully");
			}
		}
		
		
	});
}
</script>
</body>
</html>