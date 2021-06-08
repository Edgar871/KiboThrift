package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ForgotPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title> KIBO THRIFT </title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./public/assets/frontend/CSS/stylelogin.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/f6e15b711e.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"forgotpass\">\n");
      out.write("            <div class=\"mid-forgotpass\">\n");
      out.write("                <div class=\"forgotpasslogo\">\n");
      out.write("                    <img class=\"kibologo\" src=\"./public/assets/img/logoqr/kibo.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-forgotpass\">\n");
      out.write("                    <form action=\"forgotpass\" onsubmit=\"return validateForm()\" method=\"POST\" required></form>\n");
      out.write("                        <span>\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                        <input type=\"text\" disabled=\"disabled\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"*\" required name=\"id\">\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Name*\" required name=\"name\">\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Email\" required name=\"email\">\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                            <input type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Password\" required name=\"password\" id=\"password\" minlength=\"8\">\n");
      out.write("                        </span>\n");
      out.write("                        <button class=\"buttonforgot\" onclick=\"alert('Hello, Kibo Lovers!\\nPlease check your E-mail to change your password')\">PROCESS</button>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                    <p><a class=\"homepage\" href=\"SignIn.jsp\">Back to Sign In</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            var x = document.forms[\"email\"][\"confirmationemail\"].value;\n");
      out.write("            if (x == \"\") {\n");
      out.write("                alert(\"Email must be filled out\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
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
