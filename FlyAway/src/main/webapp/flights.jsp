<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1" import="java.util.List" import="java.util.ArrayList"%>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Flights</title>
</head>
<body>
<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("abc");
	if(flights!=null){
%>



<center>
<h1>Available Flights</h1>
<table border="2">
<tr>
	<th>Flightname</th>
	<th>Source</th>
	<th>Destination</th>
	<th>Price</th>
	<th>Date</th>
	
</tr>



<%
	for(String[] flight:flights){
%>

<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
<td><%=flight[3]%></td>
<td><%=flight[4]%></td>
</tr>

</center>

<%
	}
	}
%>

</table>



</body>
</html>