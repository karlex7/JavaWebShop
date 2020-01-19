package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private Model.Product product;

  public Model.Product getProduct() {
    return this.product;
  }

  public void setProduct(Model.Product product) {
    this.product = product;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getProduct() != null ) {
      _jspx_page_context.setAttribute("product", getProduct());
}

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"product\">\n");
      out.write("    <table class=\"big-table\">\n");
      out.write("        <tr>\n");
      out.write("            <td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.img}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" class=\"img-product\"/></td>\n");
      out.write("            \n");
      out.write("            <td>\n");
      out.write("                <table class=\"small-table\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.brand}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.title}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.about}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</div>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
