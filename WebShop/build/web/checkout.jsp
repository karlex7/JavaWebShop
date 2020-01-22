<%-- 
    Document   : checkout
    Created on : Jan 20, 2020, 12:35:59 PM
    Author     : FRIDAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib prefix="fri" uri="firday/tlds" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/script.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script
            src="https://www.paypal.com/sdk/js?client-id=sb"> // Required. Replace SB_CLIENT_ID with your sandbox client ID.
        </script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/menuStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/productBag.css" rel="stylesheet" type="text/css"/>
        
        <script>
            paypal.Buttons({
                createOrder: function(data, actions) {
                    // This function sets up the details of the transaction, including the amount and line item details.
                    return actions.order.create({
                        purchase_units: [{
                            amount: {
                                value: ${sum}
                            }
                        }]
                    });
                },
                onApprove: function(data, actions) {
                // This function captures the funds from the transaction.
                    return actions.order.capture().then(function(details) {
                    // This function shows a transaction success message to your buyer.
                        alert('Transaction completed by ' + details.payer.name.given_name);
                        window.location.href="orderSuccessfullPayPal";
                            // Call your server to save the transaction
                            return fetch('/paypal-transaction-complete', {
                                method: 'post',
                                headers: {
                                    'content-type': 'application/json'
                                },
                                body: JSON.stringify({
                                    orderID: data.orderID
                                })
                            });
                    });
                }
            }).render('#paypal-button-container');
        </script>

    </head>
    <body>
        <fri:menu></fri:menu>
        <div class="row">
            <h2>Checkout</h2>
            <div class="row product-bag">
                    <c:forEach items="${bagSession}" var="item">
                        <fri:productcheckout bagItem="${item}"></fri:productcheckout>
                        <hr>
                    </c:forEach>
            </div>
            
            <div class="row totalSum">
                Total: ${sum} €
            </div>
            <div class="row" style="margin: 0 auto">
                <h3 style="text-align: center; margin-bottom: 30px">Payment method</h3>
                <h4 style="text-align: center; margin-bottom: 20px">PayPal</h4>
                <div id="paypal-button-container" class="row" style="width: 200px"></div>
                <br>
                <h4 style="text-align: center; margin-bottom: 20px">Cash</h4>
                <div style="text-align: center; margin-top: 20px"><button class="btn btn-primary" style="width: 200px" onclick="orderSuccessfulCash()">Cash</button></div>
            </div>
            
            
        </div>
    </body>
</html>
