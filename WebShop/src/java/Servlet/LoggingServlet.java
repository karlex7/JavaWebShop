/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.Customer;
import Model.LogInfo;
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
@WebServlet(name = "LoggingServlet", urlPatterns = {"/logging"})
public class LoggingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IRepo repo=RepoFactory.getRepo();
        
        List<LogInfo> logInfos=repo.getAllLogInfos();
        List<Customer> customers=repo.getAllCustomers();
        
        request.getSession().setAttribute("logs", logInfos);
        request.getSession().setAttribute("customers", customers);
        
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/logging.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
