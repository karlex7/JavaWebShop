<%-- 
    Document   : productBag
    Created on : Jan 19, 2020, 5:21:24 PM
    Author     : FRIDAY
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="product" type="Model.Product" required="true" %>


<div class="product">
    <table class="big-table">
        <tr>
            <td><img src="https://www.tportal.hr/media/thumbnail/w1000/525457.jpeg"  class="img-product"/></td><!--src="${product.img}"-->
            
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
                        <td>${product.price}</td>
                    </tr>
                </table>
            </td>
            <td>
                Kolcina
            </td>
        </tr>
    </table>
</div>