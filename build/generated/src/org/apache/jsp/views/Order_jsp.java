package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title> KIBO THRIFT - Hidden Treasure </title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./public/assets/frontend/CSS/styleOrder.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/f6e15b711e.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-logo\">\n");
      out.write("            <a class=\"logo\" href=\"Kibo Thrift.html\">\n");
      out.write("                <img class=\"logokibo\" src=\"assets/logo & qr code/kibo.png\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div id=\"main-body\" class=\"main-format\">\n");
      out.write("        <div class=\"main-form\">\n");
      out.write("            <h1 class=\"cust-details\">CUSTOMER DETAILS</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"garis\"></div>\n");
      out.write("        <div class=\"main-fluid\">\n");
      out.write("            <h2>IMPORTANT</h2>\n");
      out.write("            <p>For customs purposes, you must enter the \n");
      out.write("                following details in latin characters.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"content-agile\">\n");
      out.write("\t\t<div class=\"form-main\">\n");
      out.write("\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"content-agile-three1\">\n");
      out.write("\t\t\t\t\t<div class=\"grid-shop1-agile\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-control-w3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"header-w3l\">Name</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Name\" title=\"Please enter your Full Name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-control-w3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"header-w3l\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Mail@example.com\" title=\"Please enter a Valid Email Address\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-control-w3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"header-w3l\">Contact Number</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"number\" placeholder=\"xxx xxx xxxx\" title=\"Please enter your Phone Number\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-produ\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"rating-w3l\">Products</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-product-1-w3l sub2form\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-control-w3\">\n");
      out.write("\t\t\t\t\t\t\t        <label class=\"header-w3l\">Fill Your Product's Name</label>\n");
      out.write("\t\t\t\t\t\t\t        <input type=\"text\" name=\"name\" placeholder=\"Name of Product\" title=\"Please enter your order\" required=\"\">\n");
      out.write("\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-sub-1-w3l\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" name=\"Number\" placeholder=\"1\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-sub-1-w3l formtwo\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Size</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Small</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Medium</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Large</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">XL</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">XXL</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-sub-1-w3l\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Product</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Tops</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Sweatshirt</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Denim</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Trousers</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Accessories</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-main-1\">\n");
      out.write("\t\t\t\t\t<div class=\"form-control-w3\">\n");
      out.write("\t\t\t\t\t\t<label class=\"header-w3l \">Delivery Address</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Address\" title=\"Please enter your Address\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"City\" title=\"Please enter your City\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Zip code\" title=\"Please enter your Zip code\" required=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-agile-three2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"grid-shop2-agile\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-send\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2 class=\"rating-w3l\">Send Gift</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"a-option\" name=\"selector1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"a-option\">Yes</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"check\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"b-option\" name=\"selector1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"b-option\">No</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"check\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"inside\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"threesubmitaits\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Order\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--footer-->\n");
      out.write("        <footer class=\"bagianbawah\">\n");
      out.write("                <div class=\"footer-wrap\">\n");
      out.write("                    <div class=\"socialmedia\">\n");
      out.write("                        <div class=\"container-text\">\n");
      out.write("                            <div class=\"baris\">\n");
      out.write("                                <div class=\"sosmed\">\n");
      out.write("                                    <span class=\"ket-sosmed\">Follow Us : </span>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-instagram\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-line\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-whatsapp\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-twitter\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-link\">\n");
      out.write("                        <div id=\"kiri\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">INFORMASI</a></li>\n");
      out.write("                                <li><a href=\"#\">Tentang Kami</a></li>\n");
      out.write("                                <li><a href=\"#\">Ketentuan Privasi</a></li>\n");
      out.write("                                <li><a href=\"#\">Kontak Kami</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"kanan\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">BANTUAN</a></li>\n");
      out.write("                                <li><a href=\"#\">Bayar Di Tempat</a></li>\n");
      out.write("                                <li><a href=\"#\">Cara Pemesanan</a></li>\n");
      out.write("                                <li><a href=\"#\">Ketentuan Pengembalian</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"aplikasi\">\n");
      out.write("                        <h1>Make a Better Shopping Experience With Whatsapp App</h1>\n");
      out.write("                        <p>Scan This Barcode:</p>\n");
      out.write("                        <a href=\"assets/logo & qr code/cpkibo.png\" target=\"_blank\">\n");
      out.write("                        <img src=\"assets/logo & qr code/cpkibo.png\" width=\"200\" height=\"200\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"bagianbawah2\">\n");
      out.write("                        <div class=\"copyright\">All Rights Reserved © 2020 Kibo Thrift</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </footer>\n");
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
