<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>All Employees</title>
</head>
<body>
<h1>List Employee</h1>
<h3><a href="add.html">Add More Employee</a></h3>
<c:if test="${!empty employees}">
<table align="left" border="1">
<tr>
<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Age</th>
<th>Employee Salary</th>
<th>Employee Address</th>
<th>Actions on Row</th>
</tr>
<c:forEach items="${employees}" var="employee">
<tr>
<td><c:out value="${employee.empId}"/></td>
<td><c:out value="${employee.empName}"/></td>
<td><c:out value="${employee.empAge}"/></td>
<td><c:out value="${employee.salary}"/></td>
<td><c:out value="${employee.empAddress}"/></td>
<td align="center">
<a href="edit.html?id=${employee.empId}">Edit</a>
<a href="delete.html?id=${employee.empId}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>