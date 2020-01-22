<%-- 
    Document   : singup
    Created on : Jan 21, 2020, 2:39:08 PM
    Author     : FRIDAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib prefix="fri" uri="firday/tlds" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Singup</title>
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
            <h3>Singup</h3>
            <form class="row" action="singup" method="post">
                <div class="row">
                    <label for="firstname">First name:</label>
                    <input type="text" class="form-control input-box" name="firstname" id="firstname" required/>
                </div>
                <div class="row">
                    <label for="firstname">Last name:</label>
                    <input type="text" class="form-control input-box" name="lastname" id="lastname" required/>
                </div>
                <div class="row">
                    <label for="adress">Adress:</label>
                    <input type="text" class="form-control input-box" name="adress" id="adress" required/>
                </div>
                <div class="row">
                    <label for="firstname">Email:</label>
                    <input type="email" class="form-control input-box" name="email" id="email" required/>
                </div>
                <div class="row form-group">
                        <label for="password" class="col-form-label">Password</label>
                        <input type="password" class="form-control input-box" name="password" id="password"  required/>
                    </div>
                    <div class="row form-group">
                        <input type="submit" class="btn btn-primary btn-login" value="Singup"/>
                    </div>
            </form>
        </div>
        <fri:footer></fri:footer>
    </body>
</html>
