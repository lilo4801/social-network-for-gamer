package org.apache.jsp.resource.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<div class=\"fixed-top\" id=\"header\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark\" id=\"category\" style=\"background-color: #5865F2;\">\r\n");
      out.write("        <div class=\"container-fluid row\">\r\n");
      out.write("            <a class=\"navbar-brand col-1\" href=\"viewNewsfeed\">logo</a>\r\n");
      out.write("            <button class=\"navbar-toggler collapsed col-1\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarColor02\" aria-controls=\"navbarColor02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\" style=\"margin-bottom: 8px;\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"navbar-collapse collapse col-10 row\" id=\"navbarColor02\" style=\"\">\r\n");
      out.write("                <form class=\"d-flex col-lg-6\">\r\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                    <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 offset-lg-2 col-lg-4 row\">\r\n");
      out.write("                    <li class=\"nav-item col-3\" style=\"text-align: center\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><i class=\"fas fa-comment-alt\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item col-3\"style=\"text-align: center\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"chat\"><i class=\"fas fa-bell\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item col-3\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getDisplayname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item col-3\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">log out</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div id=\"navigation\" class=\"row justify-content-between\" style=\"margin-top: 5px; display: none;\">\r\n");
      out.write("        <button class=\"btn col-lg-6\" onClick=\"window.location.href = 'viewNewsfeed'\" style=\"background-color: #5865F2; color:#FFFFFF; text-align: center; height: 50px; width: 49.8%; \">News Feed</button>   \r\n");
      out.write("        <button class=\"btn col-lg-6\" onClick=\"window.location.href = 'viewNewsfeed'\" style=\"background-color: #5865F2; color:#FFFFFF; text-align: center; height: 50px; width: 49.8%; \">Purchase</button>   \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--add this code to show navigation\r\n");
      out.write("<link rel= \"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\r\n");
      out.write("$('#header').mouseenter(function () {\r\n");
      out.write("    $(\"#navigation\").slideDown(250);\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("$(\"#header\").mouseleave(function () {\r\n");
      out.write("    $(\"#navigation\").slideUp(250);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
