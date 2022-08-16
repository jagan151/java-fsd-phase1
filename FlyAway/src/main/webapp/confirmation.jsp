<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>conformation</title>
</head>
<body>
Payment Successful! <br>Your Ticket details are:<br>
<table border=2>
<tr>
<th>Name</th>
<th>Date</th>
<th>Source</th>
<th>Destination</th>
<th>Tickets</th>
<th>Price</th>
<th>Total</th>
</tr>
<tr>
<td><%=session.getAttribute("fname") %> <%=session.getAttribute("lname") %></td>
<td><%=session.getAttribute("date") %></td>
<td><%=session.getAttribute("source") %> </td>
<td><%=session.getAttribute("destination") %></td>
<td><%=session.getAttribute("nop") %> </td>
<td><%=session.getAttribute("rate") %></td>
<td><%=session.getAttribute("total") %></td>
</tr>
</table>

<a href="index.jsp">HOME PAGE</a>



</body>
</html>