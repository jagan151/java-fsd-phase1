<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method=post action="details">
Selected Airline: <%=session.getAttribute("airline") %><br/>
Enter Firstname: <input type="text" name="fname" required><br/>
Enter Lastname: <input type="text" name="lname" required><br/>
Enter DOB: <input type="date" name="dob" required><br/>
Enter Gender: <input type="radio" name="gender" value="male"> Male <input type="radio" name="gender" value="female"> Female <input type="radio" name="gender" value="other"> Other<br>
Enter Contact: <input type="number" name="contact" required><br/>
Enter MailID: <input type="text" name="mail" required><br/>
<% String b = request.getParameter("airline");

session.setAttribute("airline",b);
String a = request.getParameter("nop");
session.setAttribute("nop",a);%>
<input type="submit" value="Submit">
</form>


</body>
</html>