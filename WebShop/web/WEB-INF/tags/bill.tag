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
            <c:when test="${bill.paymentMethodID == 0}">Paypal</c:when>
            <c:when test="${bill.paymentMethodID == 1}">Cash</c:when>
            <c:otherwise>Bitcoin</c:otherwise>
        </c:choose>
            &nbsp;|&nbsp; 
        <form action="viewBill" method="post">
            <button type="submit" name="idBill" value="${bill.IDBill}" class="btn-link">View bill</button>
        </form>
    </p>
</div>