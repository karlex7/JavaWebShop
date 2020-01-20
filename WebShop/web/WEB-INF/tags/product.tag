<%-- 
    Document   : product
    Created on : Jan 19, 2020, 1:38:37 PM
    Author     : FRIDAY
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="product" type="Model.Product" required="true" %>


<div class="product">
    <div class="row">
        <img src="https://www.tportal.hr/media/thumbnail/w1000/525457.jpeg"  class="img-product"/></td><!--src="${product.img}"-->
    </div>
    <div class="row">
        <div class="row product-info">Title: ${product.title}</div>
        <div class="row product-info">Brand: ${product.brand}</div>
        <div class="row product-info">About: ${product.about}</div>
        <div class="row product-info">Price: ${product.price} €</div>
    </div>
           
    <form class="form-add" action="addBag" method="post">
        <input type="hidden" name="idProduct" value="${product.IDProduct}"/>
        <button type="submit" class="btn btn-primary btn-add">Add</button>
    </form>
</div>