/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.Product;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FRIDAY
 */
@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idProduct=Integer.parseInt(request.getParameter("idProduct"));
        Product p;
        IRepo repo=RepoFactory.getRepo();
        
        try {
            p = repo.getProduct(idProduct);
        } catch (Exception e) {
            p = null;
            e.printStackTrace();
        }

        request.getSession().setAttribute("product", p);
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/product.jsp");
        rd.forward(request, response);
    }
}
    
