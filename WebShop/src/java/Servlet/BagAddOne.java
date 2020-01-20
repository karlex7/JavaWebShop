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
@WebServlet(name = "BagAddOne", urlPatterns = {"/add"})
public class BagAddOne extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idProduct=Integer.parseInt(request.getParameter("idProduct"));
        List<BagItem> bagSession=(List<BagItem>) request.getSession().getAttribute("bagSession");
        for (BagItem bagItem : bagSession) {
            if (bagItem.getProduct().getIDProduct()==idProduct) {
                int quanitity=bagItem.getQuantity();
                quanitity++;
                bagItem.setQuantity(quanitity);
            }
        }
        
        response.sendRedirect("bag.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
