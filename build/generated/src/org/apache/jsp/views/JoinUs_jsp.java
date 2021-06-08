package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JoinUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/frontend/CSS/stylelogin.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/f6e15b711e.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"mid-joinus\">\n");
      out.write("            <div class=\"mid-joinus-right\">\n");
      out.write("                <div class=\"joinus-logo\">\n");
      out.write("                    <a href=\"SignIn.jsp\"><img class=\"kibologo\" src=\"../public/assets/img/logoqr/kibo.jpg\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-joinus\">\n");
      out.write("                    <form name = \"myform\" >\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                            <input type=\"text\" placeholder=\"Firstname\" required name=\"cust_fname\"required>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                            <input type=\"text\" placeholder=\"Lastname\" required name=\"cust_lname\" required>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-envelope\"></i>\n");
      out.write("                            <input type=\"text\" placeholder=\"Email\" required name=\"cust_email\" required>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                            <input type=\"password\" placeholder=\"Password (Min. 8 Character)\" required name=\"password\" id=\"password\" minlength=\"8\" required>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                            <input type=\"password\" placeholder=\"Confirm Password\" required name=\"password_confirm\"  id=\"confirm_password\" minlength=\"8\"required>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <button id=\"tombol\"  class=\"buttonjoinus\">JOIN US</button>\n");
      out.write("                    </form>\n");
      out.write("                        <table class=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                              <th><a class=\"back2signin\" href=\"SignIn.jsp\">Back to Sign In</a></th>\n");
      out.write("                            </tr>\n");
      out.write("                          </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- <script src=\"dist/sweetalert2.all.min.js\"></script> -->\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var password = document.getElementById(\"password\")\n");
      out.write("         confirm_password = document.getElementById(\"confirm_password\");\n");
      out.write("\n");
      out.write("    function validatePassword(){\n");
      out.write("        if(password.value != confirm_password.value) {\n");
      out.write("        confirm_password.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("        } else {\n");
      out.write("        confirm_password.setCustomValidity('');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("//     password.onchange = validatePassword;\n");
      out.write("//     confirm_password.onkeyup = validatePassword;\n");
      out.write("\n");
      out.write("//     const tombol = document.querySelector('#tombol');\n");
      out.write("// tombol.addEventListener('click', function () {\n");
      out.write("//     Swal.fire({\n");
      out.write("// text:  'Berhasil Membuat Akun',\n");
      out.write("// icon:  'success',\n");
      out.write("//     })\n");
      out.write("//     .then(function() {\n");
      out.write("//     window.location = \"Kibo Thrift.html\";\n");
      out.write("// });\n");
      out.write("// })\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
