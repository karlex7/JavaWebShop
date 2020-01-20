/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.BagItem;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "AddToBaggServlet", urlPatterns = {"/addBag"})
public class AddToBaggServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Dohvati product koji treba u kosaricu
        /*int idProduct=Integer.parseInt(request.getParameter("idProduct"));
        Product p;
        IRepo repo=RepoFactory.getRepo();
        try {
            p = repo.getProduct(idProduct);
        } catch (Exception e) {
            p = null;
            e.printStackTrace();
        }
        
        
        //Dohvati Bag Session
        List<Product> bagSession=(List<Product>) request.getSession().getAttribute("bagSession");
        if (bagSession!=null) {
            //Maknemo proizvod ako je vec u kosarici
            for (Product b : bagSession) {
                if (b.getIDProduct()==p.getIDProduct()) {
                   // bagSession.remove(b);
                }
            }
            //Dodamo proizvod ali jedan
            bagSession.add(p);
            request.getSession().setAttribute("bagSession", bagSession);
        }
        else{
            List<Product> bagSessionNew=new ArrayList<>();
            bagSessionNew.add(p);
            request.getSession().setAttribute("bagSession", bagSessionNew);
        }
        response.sendRedirect("bag.jsp");*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Dohvati product koji treba u kosaricu
        int idProduct=Integer.parseInt(request.getParameter("idProduct"));
        Product p;
        IRepo repo=RepoFactory.getRepo();
        try {
            p = repo.getProduct(idProduct);
        } catch (Exception e) {
            p = null;
            e.printStackTrace();
        }
        
        BagItem bagItem=new BagItem(p, 1);
        List<BagItem> bagSession=(List<BagItem>) request.getSession().getAttribute("bagSession");
        boolean alreagyInBag=true;
        
        if (bagSession!=null) {
            
            for (BagItem b : bagSession) {
                if (b.getProduct().getIDProduct()==idProduct) {
                    int quantity=b.getQuantity();
                    quantity++;
                    b.setQuantity(quantity);
                    alreagyInBag=false;
                }
            }
            if (alreagyInBag) {
                bagSession.add(bagItem);
            }
            request.getSession().setAttribute("bagSession", bagSession);
        }
        else{
            List<BagItem> bagSessionNew=new ArrayList<>();
            bagSessionNew.add(bagItem);
            request.getSession().setAttribute("bagSession", bagSessionNew);
        }
        
        float sum=Utils.Utils.calculateTotalSum(bagSession);
        request.getSession().setAttribute("sum", sum);
        response.sendRedirect("bag.jsp");
    }

}
