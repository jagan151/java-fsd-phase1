<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>payment</title>
</head>
<body>
<form method=post action="confirmation.jsp">
You have to pay <%=session.getAttribute("price") %> to confirm!
<% String a = request.getParameter("fname");
session.setAttribute("fname",a);
String b = request.getParameter("lname");
session.setAttribute("lname",b);
String c=session.getAttribute("s").toString();
session.setAttribute("source",c);
String d=session.getAttribute("d").toString();
session.setAttribute("destination",d);
String e=session.getAttribute("date").toString();
session.setAttribute("date",e);
String f=session.getAttribute("rate").toString();
session.setAttribute("rate",f);
String g=session.getAttribute("n").toString();
session.setAttribute("nop",g);
String h=session.getAttribute("t").toString();
session.setAttribute("total",h);

%>
<input type="submit" value="Pay">

</form>


</body>
</html>