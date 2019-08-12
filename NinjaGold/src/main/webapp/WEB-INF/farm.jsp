<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
Your Gold <c:out value="${gold}"/>
Farm:<br>
<a href="/farm">Farm earns 10-20 gold</a><br>
House:<br>
<a href="/house">House earns 2-5 gold</a><br>
Casino:<br>
<a href="/casino">Casino earns may earn or lose 50 gold</a><br>
</body>
</html>