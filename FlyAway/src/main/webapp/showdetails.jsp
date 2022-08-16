<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking details</title>
</head>
<body>
<table border=2>
            <thead>
                <tr>
                    <th>Airline</th>
                    <th>Price</th>
                    
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${details}" var="i">
                <tr>
                    <td>${i.key}</td>
                    <td>${i.value}</td>
                    
                </tr>
                </c:forEach>   
            </tbody>
        </table>
        
        <form method=post action="airlinevalid">
Enter Airline: <input type="text" name="airline" required><br/>
No. of Persons: <input type="number" name="nop" required><br />

<input type="submit" value="Submit">


</form>


</body>
</html>