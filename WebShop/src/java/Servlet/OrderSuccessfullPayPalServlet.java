/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.BagItem;
import Model.Bill;
import Model.Customer;
import Model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
@WebServlet(name = "OrderSuccessfullPayPalServlet", urlPatterns = {"/orderSuccessfullPayPal"})
public class OrderSuccessfullPayPalServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IRepo repo=RepoFactory.getRepo();
        
        List<BagItem> bagSession=(List<BagItem>) request.getSession().getAttribute("bagSession");
        String email=(String) request.getSession().getAttribute("username");
        Customer c=Utils.Utils.getCustomerFromEmail(email);
        //Customer c=new Customer(1, "Karlo", "Hren", "Hum Stubicki 1 Gornja Stubica 49245", "karlo@email.hr", "123");
        String date=Utils.Utils.getTodaysDate();
        
        Bill b=new Bill(date, c.getIDCustomer(), 1);
        repo.insertBill(b,bagSession);
        
        // Izbrisati bag
        if (request.getSession().getAttribute("bagSession") != null){
                request.getSession().removeAttribute("bagSession");
            }
        if (request.getSession().getAttribute("sum") != null){
                request.getSession().removeAttribute("sum");
            }
        
        response.sendRedirect("home.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
