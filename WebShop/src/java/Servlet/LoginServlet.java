/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FRIDAY
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IRepo repo=RepoFactory.getRepo();
        
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if (repo.checkCustomer(username, password)) {
            request.getSession().setAttribute("username", username);
            
            Utils.Utils.createLog(username, request);
            response.sendRedirect("home.jsp");
        }else if(username.equalsIgnoreCase(ADMIN_USERNAME) && password.equalsIgnoreCase(ADMIN_PASSWORD)){
            request.getSession().setAttribute("admin", ADMIN_USERNAME);
            response.sendRedirect("home.jsp");
        }else{
            response.sendRedirect("login.jsp");
        }
        
        
        //getServletContext().getRequestDispatcher("/test.jsp").forward(request, response);
        
    }

}
