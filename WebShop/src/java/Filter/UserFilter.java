/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FRIDAY
 */
@WebFilter(filterName = "UserFilter", urlPatterns = {"/checkout","/orderSuccessfullPayPal","/orderSuccessfull","/viewBill"})
public class UserFilter implements Filter {
    
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        String loginURI=request.getServletContext().getContextPath()+"/login.jsp";
        
        if (request.getSession().getAttribute("username")==null) {
            ((HttpServletResponse) resp).sendRedirect(loginURI);
        }
        else{
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig filterConfig) {        
    }

    
}
