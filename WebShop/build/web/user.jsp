<%-- 
    Document   : user
    Created on : Jan 20, 2020, 7:11:52 PM
    Author     : FRIDAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib prefix="fri" uri="firday/tlds" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/menuStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/userStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <fri:menu></fri:menu>
        <div class="row">
            <h2>Customer data</h2>
            <div class="row customer-data">
                <h3>Customer info:</h3>
                <div class="customer">
                    <p><b>First name:</b>&nbsp; ${customer.firstName}</p>
                    <p><b>Last name:</b>&nbsp; ${customer.lastName}</p>
                    <p><b>Address:</b>&nbsp; ${customer.adress}</p>
                    <p><b>Email:</b>&nbsp; ${customer.email}</p>
                </div>
            </div>
            <div class="row">
                <h3>Bills</h3>
                <c:forEach items="${bills}" var="item">
                    <li>
                        <fri:bill bill="${item}"></fri:bill>
                    </li>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
