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
            <td><img src="https://www.tportal.hr/media/thumbnail/w1000/525457.jpeg"  class="img-product"/></td><!--src="${bagItem.product.img}"-->
            
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
            <td>
                <div class="bag-manipulation">
                    <button class="btn btn-light" style="width: 35px" onclick="bagAddOne(this.value)" value="${bagItem.product.IDProduct}">+</button>
                    <input type="button" value="-" class="btn btn-light" style="width: 35px"/>
                </div>
            </td>
        </tr>
    </table>
</div>