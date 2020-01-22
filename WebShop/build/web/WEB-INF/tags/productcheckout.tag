<%-- 
    Document   : productBag
    Created on : Jan 19, 2020, 5:21:24 PM
    Author     : FRIDAY
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="bagItem" type="Model.BagItem" required="true" %>


<div class="product">
    <table class="big-table">
        <tr>
            <td><img src="${bagItem.product.img}" class="img-product"/></td><!--src="${bagItem.product.img}"-->
            
            <td>
                <table class="small-table" >
                    <tr>
                        <td>${bagItem.product.brand}</td>
                    </tr>
                    <tr>
                        <td>${bagItem.product.title}</td>
                    </tr>
                    <tr>
                        <td>${bagItem.product.price} €</td>
                    </tr>
                </table>
            </td>
            <td>
                Quantity : ${bagItem.quantity}
            </td>
        </tr>
    </table>
</div>