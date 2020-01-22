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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "ViewCategoryServlet", urlPatterns = {"/viewCategory"})
public class ViewCategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IRepo repo=RepoFactory.getRepo();
        
        int idCategory =Integer.parseInt(request.getParameter("idCategory"));
        
        List<Product> categoryProducts=new ArrayList<>();
        List<Product> allProducts=repo.getAllProducts();
        for (Product p : allProducts) {
            if (p.getCategoryID()==idCategory) {
                categoryProducts.add(p);
            }
        }
        
        request.getSession().setAttribute("categoryProducts", categoryProducts);
        
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/categoryProducts.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
