<%-- 
    Document   : products
    Created on : Jan 17, 2020, 12:58:25 PM
    Author     : FRIDAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <ul>
            <c:forEach items="${products}" var="item">
                <li>
                    ${item.title}
                </li>
            </c:forEach>
        </ul>
        
    </body>
</html>
