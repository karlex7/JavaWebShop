/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.BagItem;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FRIDAY
 */
@WebServlet(name = "BagRemoveOne", urlPatterns = {"/remove"})
public class BagRemoveOne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idProduct=Integer.parseInt(request.getParameter("idProduct"));
        List<BagItem> bagSession=(List<BagItem>) request.getSession().getAttribute("bagSession");
        BagItem bRemove=null;
        for (BagItem bagItem : bagSession) {
            if (bagItem.getProduct().getIDProduct()==idProduct) {
                if (bagItem.getQuantity()>1) {
                    int quanitity=bagItem.getQuantity();
                    quanitity--;
                    bagItem.setQuantity(quanitity);
                }else{
                    bRemove=bagItem;
                }
            }
        }
        
        
        bagSession.remove(bRemove);
        request.getSession().setAttribute("bagSession", bagSession);
        float sum=Utils.Utils.calculateTotalSum(bagSession);
        request.getSession().setAttribute("sum", sum);
        
        response.sendRedirect("bag.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
