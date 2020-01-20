<%-- 
    Document   : menu
    Created on : Jan 18, 2020, 10:51:45 AM
    Author     : FRIDAY
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <div class="logo-area">
        <a href="home.jsp"><img class="logo" src="img/logo.png" alt="Logo"/></a>
    </div>
    <div class="main-nav">
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="products">Products</a></li>
            <li>
                <c:if test="${sessionScope.admin != null}">
                    <a href="admin/logging" id="btnAdmin" style="margin-right:5px" class="btn btn-primary btn-sm myButton">Admin Page</a>
                </c:if>
            </li>
            <!--<c:if test="${sessionScope.username != null}">
                <a class="btn btn-outline-secondary btn-sm myButton" style="margin-right:5px" href="bag.">My Bag</a>
            </c:if>-->
            <li><a class="btn btn-outline-secondary btn-sm myButton" style="margin-right:5px" href="bag.jsp">My Bag</a></li>
            <li>
                <c:choose>
                <c:when test="${sessionScope.username == null && sessionScope.admin == null}">
                    <a class="btn" href="login.jsp">Login</a>
                </c:when>
                <c:otherwise>
                    <a class="btn" href="logout">Logout</a>
                </c:otherwise>
                </c:choose>
            </li>
            
            <c:if test="${sessionScope.username != null}">
                <form action="user" method="post">
                    <button type="submit" style="margin-right:5px;margin-top: 15px" class="btn btn-primary btn-sm myButton">${sessionScope.username}</button>
                    <input type="hidden" value="${sessionScope.username}" name="username"/>
                </form>
            </c:if>
            

        </ul>
    </div>
</nav>