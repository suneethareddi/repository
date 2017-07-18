<%@ page isELIgnored="false" %>
<html>
<head>
<title>Insert  here</title>
</head>
<body>
<h2>Edit Employee Data</h2>
<form method="POST" action="edit.html">
<%-- <tr>
<td>Employee Id</td>
<td><input type=text name="empid" value=<%=request.getAttribute("eid")%> readonly="true"></td>
</tr> --%>
<table>
<tr>
<td>Employee Name</td>
<td><input type="text" name="empName" value="${emp.empName}"></td>
</tr>
<tr>
<td>Employee Age</td>
<td><input type="text" name="empAge" value="${emp.empAge}"></td>
</tr>
<tr>
<td>Employee Salary</td>
<td><input type="text" name="empSalary" value="${emp.empSalary}"></td>
</tr>
<tr>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</table>
</form>
</body>
</html>