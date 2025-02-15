/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.Bill;
import Model.Customer;
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
@WebServlet(name = "UserServlet", urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String  username=request.getParameter("username");
        
        IRepo repo=RepoFactory.getRepo();
        Customer c=Utils.Utils.getCustomerFromEmail(username);
        List<Bill> bills=repo.getBillsForCustomer(c.getIDCustomer());
        Customer customer=new Customer(c.getIDCustomer(), c.getFirstName(),c.getLastName(),c.getAdress(),c.getEmail(),c.getCustomerPassword());
        
        
        
        
        
        request.getSession().setAttribute("bills", bills);
        request.getSession().setAttribute("customer",customer);
        
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/user.jsp");
        rd.forward(request, response);
        //response.sendRedirect("user.jsp");
    }

}
