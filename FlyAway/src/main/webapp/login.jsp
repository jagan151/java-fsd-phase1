<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login portal</title>
</head>
<body>
<form method=post action="adminservlet">
Enter userid: <input type="text" name="userid" required><br>
Enter Password: <input type="password" name="pword" required><br>
<input type="submit" value="Submit">
</form>

</body>
</html>