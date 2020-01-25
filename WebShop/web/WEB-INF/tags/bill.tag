<%-- 
    Document   : bill
    Created on : Jan 21, 2020, 10:31:29 AM
    Author     : FRIDAY
--%>


<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="bill" type="Model.Bill" required="true" %>

<div class="bill">
    <p><b>Bill No: </b> ${bill.IDBill} &nbsp; | &nbsp; <b>Date:</b> ${bill.billDate} &nbsp;|&nbsp;<b>Payment method:</b>
        <c:choose>
            <c:when test="${bill.paymentMethodID == 1}">Paypal</c:when>
            <c:when test="${bill.paymentMethodID == 2}">Cash</c:when>
            <c:otherwise>Bitcoin</c:otherwise>
        </c:choose>
            <form action="viewBill" method="post">
                <input type="hidden" name="idBill" value="${bill.IDBill}"/>
                <button type="submit" class="btn btn-primary" style="margin-left: 20px">View items</button>
            </form>
            <!--<a href="viewBill?idBill=${bill.IDBill}">View Bill</a>-->
        <!--<button class="btn btn-light" onclick="viewBill(this.value)" value="${bill.IDBill}">View Bill</button>-->
        <!--<form action="viewBill" method="post">
            <button type="submit" name="idBill" value="${bill.IDBill}" class="btn-link">View bill</button>
        </form>-->
    </p>
</div>