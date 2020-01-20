<%-- 
    Document   : product
    Created on : Jan 18, 2020, 8:48:03 PM
    Author     : FRIDAY
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="product" type="Model.Product" required="true" %>


<div class="product">
    <table class="big-table">
        <tr>
            <td><img src="${product.img}" class="img-product"/></td><!--src="${product.img}"-->
            
            <td>
                <table class="small-table" >
                    <tr>
                        <td>${product.brand}</td>
                        <td>${product.title}</td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            ${product.about}
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>${product.price} €</td>
                    </tr>
                </table>
            </td>
            <td>
                <form action="product" method="post">
                    <input type="hidden" name="idProduct" value="${product.IDProduct}"/>
                    <button type="submit" class="btn btn-primary" style="margin-left: 20px">View</button>
                </form>
            </td>
        </tr>
    </table>
</div>