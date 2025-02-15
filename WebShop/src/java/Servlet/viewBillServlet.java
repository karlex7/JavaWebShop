/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.Bill;
import Model.Item;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "viewBillServlet", urlPatterns = {"/viewBill"})
public class viewBillServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idBill=Integer.parseInt(request.getParameter("idBill"));
        
        IRepo repo=RepoFactory.getRepo();
        Bill bill;
        bill=repo.getBill(idBill);
        List<Item> items=repo.getItemsForBill(idBill);
        List<Product> products=repo.getAllProducts();
        
        request.setAttribute("bill",bill);
        request.setAttribute("items", items);
        request.setAttribute("productsBill", products);
        
        //response.sendRedirect("bill.jsp");
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/bill.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idBill=Integer.parseInt(request.getParameter("idBill"));
        
        IRepo repo=RepoFactory.getRepo();
        Bill bill=repo.getBill(idBill);
        List<Item> items=repo.getItemsForBill(idBill);
        List<Product> products=repo.getAllProducts();
        
        request.setAttribute("bill",bill);
        request.setAttribute("items", items);
        request.setAttribute("productsBill", products);
        
        
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/bill.jsp");
        rd.forward(request, response);
    }

}
