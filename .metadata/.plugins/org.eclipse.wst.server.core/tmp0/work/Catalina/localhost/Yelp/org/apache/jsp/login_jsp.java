/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2013-04-23 20:27:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head><title>Online movie store template</title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("<div id=\"inner\">\n");
      out.write("<div id=\"header\">\n");
      out.write("<h1><img src=\"images/logo.gif\" alt=\"Online Movie Rental\" height=\"63\" width=\"519\" /></h1>\n");
      out.write("<div id=\"nav\"> <a href=\"http://www.freewebsitetemplates.com\">your account</a>\n");
      out.write("| <a href=\"http://www.freewebsitetemplates.com\">view cart</a>\n");
      out.write("| <a href=\"login.jsp\">login</a>\n");
      out.write("</div>\n");
      out.write("<!-- end nav --> <a href=\"http://www.freewebsitetemplates.com\"><img src=\"images/header_1.jpg\" alt=\"Harry Potter cd\" height=\"145\" width=\"744\" /></a> <a href=\"http://www.freewebsitetemplates.com\"><img src=\"images/header_2.jpg\" alt=\"\" height=\"48\" width=\"745\" /></a> </div>\n");
      out.write("<!-- end header -->\n");
      out.write("<dl id=\"browse\">\n");
      out.write("<dt>Full Category Lists</dt>\n");
      out.write("<dd class=\"first\"><a href=\"http://www.freewebsitetemplates.com\">Action &amp;\n");
      out.write("Adventure</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Anime\n");
      out.write("&amp; Manga</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Art\n");
      out.write("House &amp; International</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Classics</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Comedy</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Cult\n");
      out.write("Movies</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Drama</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">New\n");
      out.write("&amp; Future Releases</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Horror</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Musicals</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Mystery\n");
      out.write("&amp; Suspense</a></dd>\n");
      out.write("<dd><a href=\"http://www.freewebsitetemplates.com\">Science\n");
      out.write("Fiction &amp; Fantasy</a></dd>\n");
      out.write("<dd class=\"last\"><a href=\"http://www.freewebsitetemplates.com\">Westerns</a></dd>\n");
      out.write("<dt>Search Your Favourite Movie</dt>\n");
      out.write("<dd class=\"searchform\">\n");
      out.write("<form action=\"?\" method=\"get\">\n");
      out.write("<div>\n");
      out.write("<select name=\"cat\"><option value=\"-\" selected=\"selected\">CATEGORIES</option><option value=\"-\">------------</option></select>\n");
      out.write("</div>\n");
      out.write("<div><input name=\"q\" value=\"DVD TITLE\" class=\"text\" type=\"text\" /></div>\n");
      out.write("<div class=\"softright\"><input src=\"images/btn_search.gif\" type=\"image\" /></div>\n");
      out.write("</form>\n");
      out.write("</dd>\n");
      out.write("</dl>\n");
      out.write("<div id=\"body\">\n");
      out.write("<div class=\"inner\">\n");
      out.write("<div id=\"choice\" align=\"center\">\n");
      out.write("<p>\n");
      out.write("If you are already a registered user, please login below.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write(" If you are not a registered user, Please <a href=\"Register.jsp\"> register </a> here.\n");
      out.write("</p>\n");
      out.write("<div id=\"formcontent\" align=\"center\">\n");
      out.write("<form id=\"form1\" method=\"post\" action=\"SigninServlet\">\n");
      out.write("        \n");
      out.write("    <div class=\"form-row\"> \n");
      out.write("    Email: <br>\n");
      out.write("    <input type=\"text\" name=\"email\" size=\"40\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Error.notuser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Error.wrong}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"form-row\"> \n");
      out.write("    Password:<br>\n");
      out.write("    <input type=\"password\" name=\"password\" size=\"40\"/>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Error.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-row\"> \n");
      out.write("    <input class=\"submit\" type=\"submit\" value=\"Login\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cannot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <font color=\"red\">\n");
 if (request.getAttribute("message") != null) { 
      out.write('\n');
      out.print(request.getAttribute("message") );
      out.write('\n');
 } 
      out.write("</font>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<!-- end .inner --> </div>\n");
      out.write("<!-- end body -->\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<div id=\"footer\"> Web design, Supported by CMPE 273 \n");
      out.write("<div id=\"footnav\"> Legal \n");
      out.write("Privacy\n");
      out.write("Policy </div>\n");
      out.write("<!-- end footnav --> </div>\n");
      out.write("<!-- end footer --> </div>\n");
      out.write("<!-- end inner --> </div>\n");
      out.write("<!-- end wrapper -->\n");
      out.write("</body></html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
