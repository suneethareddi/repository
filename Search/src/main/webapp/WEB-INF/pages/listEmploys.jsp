<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form>
<table border=3px>
<tr>
  <th>EmployName</th>
   <th>salary</th>
    <th>age</th>
     <th>ACTION</th>
</tr>
<c:forEach var="hii" items="${employ}">
	<%-- <h1>hiiiiii::${hii.empName}</h1> --%>
	<tr>
	<td>${hii.empName}</td>
 <td>${hii.empSalary}</td>
 <td>${hii.empAge}</td>	
 <td><a href="getDeatils?id=${hii.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
</form>
