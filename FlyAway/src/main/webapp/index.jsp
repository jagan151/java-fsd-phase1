<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Portal</title>
</head>
<body>
<form method=post action="getdata">
Enter source: <input type="text" name="source" required><br />
Enter destination: <input type="text" name="destination" required><br />
Enter date: <input type="date" name="date" value="01-01-2000" required><br />

<input type="submit" value="Submit">
</form>
<a href="login.jsp">Admin</a>


</body>
</html>