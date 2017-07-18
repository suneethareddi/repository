<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page isELIgnored="false" %>
<html>
<head>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    
    <!-- Load jQuery JS -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <!-- Load jQuery UI Main JS  -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

</head>

<%-- <jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    
    <!-- Load jQuery JS -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <!-- Load jQuery UI Main JS  -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function(){
	$('.datepicker').datepicker({
		changeMonth:true,
		changeYear:true,
		dateFormat: 'yy-mm-dd'
		
	});
});
</script>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    
    <!-- Load jQuery JS -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <!-- Load jQuery UI Main JS  -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function(){
	$('.datepicker').datepicker({
		changeMonth:true,
		changeYear:true,
		dateFormat: 'yy-mm-dd'
		
	});
});
</script>
</head> --%>
<body>
<form action="searchtext" method="post">
Name: <input type="text" name="employeename" placeholder="search through name"/>&nbsp;
MailId: <input type="text" name="emailid" placeholder="search through mail"/>&nbsp;
Status: <input type="text" name="status" placeholder="search through status"/>&nbsp;
From: <input type="text" name="startdate" class="datepicker" placeholder="start from"/>&nbsp; 
To: <input type="text" class="datepicker" name="enddate" placeholder="end date"/>
<button type="submit">search</button>
</form><br/><br/>
<table border=3px>
<tr>
  <th>name</th>
   <th>mailid</th>
    <th>status</th>
    <th>registered date</th>
</tr>


<c:forEach var="detail" items="${details}">
<tr>
 <td>${detail.employeename}</td>
 <td>${detail.emailid}</td>
 <td>${detail.status}</td>
 <td>${detail.regdate}</td>	
</tr>
</c:forEach>
</table>


<script type="text/javascript">
$(document).ready(function(){
	$('.datepicker').datepicker({
		changeMonth:true,
		changeYear:true,
		dateFormat: 'yy-mm-dd'
		
	});
});
</script>
</body>
</html>
