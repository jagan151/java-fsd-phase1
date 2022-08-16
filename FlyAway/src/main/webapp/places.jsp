<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List" import="java.util.ArrayList"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Source and Destination</title>
</head>
<body>
<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("sd");
	if(flights!=null){
%>



<center>
<h1>Source and Destination</h1>
<table border="2">
<tr>
	<th>Source</th>
	<th>Destination</th>
	
</tr>



<%
	for(String[] flight:flights){
%>

<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>

</tr>

</center>

<%
	}
%>

</table>
<%
	}
	
%>


</body>
</html>