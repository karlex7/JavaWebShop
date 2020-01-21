<%-- 
    Document   : bill
    Created on : Jan 21, 2020, 10:54:35 AM
    Author     : FRIDAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib prefix="fri" uri="firday/tlds" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script src="js/script.js" type="text/javascript"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/menuStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <fri:menu></fri:menu>
        <div class="row">
            <h3>Hello</h3>
            <h4>Bill items:</h4>
        <ol>
        <c:forEach var="i" items="${items}">
            <c:forEach var="item" items="${productsBill}">
                <c:if test="${item.IDProduct == i.productID}">
                    <li>&nbsp; ${item.brand} &nbsp; ${item.title} &nbsp; <b>Quantity:&nbsp;</b> ${i.quantity}</li>
                </c:if>
            </c:forEach>
        </c:forEach>
        </ol>
        </div>
    </body>
</html>
