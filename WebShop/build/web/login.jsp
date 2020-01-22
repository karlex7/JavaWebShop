<%-- 
    Document   : login
    Created on : Jan 18, 2020, 5:05:56 PM
    Author     : FRIDAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib prefix="fri" uri="firday/tlds" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/menuStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/loginStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <fri:menu></fri:menu>
        <div class="row">
            <h1>Login in Webshop </h1>
            <div class="row">
                <form class="needs-validation login-form" action="login" method="post">
                    <div class="row from-group">
                        <label for="username" class="col-form-label">Username</label>
                        <input type="text" class="form-control input-box" name="username" id="username" required/>
                    </div>
                    <div class="row form-group">
                        <label for="password" class="col-form-label">Password</label>
                        <input type="password" class="form-control input-box" name="password" id="password" required/>
                    </div>
                    <div class="row form-group">
                        <input type="submit" class="btn btn-primary btn-login" value="Login"/>
                    </div>
                </form>
            </div>
            
        </div>
        <fri:footer></fri:footer>
    </body>
</html>
