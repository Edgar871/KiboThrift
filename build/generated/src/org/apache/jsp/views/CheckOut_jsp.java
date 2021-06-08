package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheckOut_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/frontend/CSS/checkout.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/f6e15b711e.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"page-wrapper\">\n");
      out.write("        <!--Judul-->\n");
      out.write("            <header>\n");
      out.write("                <navbar>\n");
      out.write("                    <div id=\"mySidenav\" class=\"headerkiri\">\n");
      out.write("                        <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("                                <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"SignIn.jsp\">Sign Out</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <span style=\"font-size:30px;cursor:pointer\" class=\"bar\" onclick=\"openNav()\">&#9776;</span>\n");
      out.write("                        <div class=\"headertengah\">\n");
      out.write("                            <a class=\"logo\" href=\"home.jsp\">\n");
      out.write("                                <img class=\"logokibo\" src=\"../public/assets/img/logoqr/kibo.jpg\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"headerkanan\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"\" class=\"search\">\n");
      out.write("                                        <i class=\"fas fa-search\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>                 \n");
      out.write("                                    <a href=\"\" class=\"shopcart\">\n");
      out.write("                                        <i class=\"fas fa-shopping-bag\">\n");
      out.write("                                        <span id=\"totalitem\"></span>\n");
      out.write("                                        </i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                </navbar>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"container-img\">\n");
      out.write("                    <ul class=\"kolom-img\">\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"img-btn\">\n");
      out.write("                                <img class=\"img1\" src=\"../public/assets/img/denim/auroradenim.jpg\" width=\"270\" height=\"397\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"img-btn\">\n");
      out.write("                                <img class=\"img2\" src=\"../public/assets/img/denim/auroradenim2.jpg\" width=\"270\" height=\"397\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"produk-actions\" style=\"position: relative;\" top=\"60px\">\n");
      out.write("                    <div class=\"harga-produk\">\n");
      out.write("                        <div class=\"produk-features\">\n");
      out.write("                            <div class=\"details\"></div>\n");
      out.write("                            <h1 itemprop=\"name\" class=\"nama-produk\">Aurora Denim Trousers</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prices\">\n");
      out.write("                            <span class=\"produk-price\">Rp. 200.000</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"produk-form\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"form-size\" id=\"sizeContainer\">\n");
      out.write("                                <div class=\"selector\" id=\"sizeSelector\">\n");
      out.write("                                    <label> Choose your size : </label>\n");
      out.write("                                    <select name=\"size\" class=\"size\">\n");
      out.write("                                        <option value=\"S\">S</option>\n");
      out.write("                                        <option value=\"M\">M</option>\n");
      out.write("                                        <option value=\"L\">L</option>\n");
      out.write("                                        <option value=\"XL\">XL</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"container-add-cart\" id=\"addcart\">\n");
      out.write("                                <a href=\"FormatOrder.jsp\"><button class=\"co-btn add-cart\" type=\"button\">CHECKOUT</button></a>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <p><a class=\"addbag\" href=\"#shoppingbag\">Add to shopping bag</a></p>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--footer-->\n");
      out.write("            <footer class=\"bagianbawah\">\n");
      out.write("                <div class=\"footer-wrap\">\n");
      out.write("                    <div class=\"socialmedia\">\n");
      out.write("                        <div class=\"container-text\">\n");
      out.write("                            <div class=\"baris\">\n");
      out.write("                                <div class=\"sosmed\">\n");
      out.write("                                    <span class=\"ket-sosmed\">Follow Us : </span>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-instagram\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-line\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-whatsapp\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" target=\"_blank\">\n");
      out.write("                                        <i class=\"fab fa-twitter\" aria-hidden=\"true\"></i>\n");
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
      out.write("                        <a href=\"../public/assets/img/logoqr/cpkibo.jpg\"></a>\n");
      out.write("                        <img src=\"../public/assets/img/logoqr/cpkibo.jpg\" width=\"200\" height=\"200\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"bagianbawah2\">\n");
      out.write("                        <div class=\"copyright\">All Rights Reserved © 2020 Kibo Thrift</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                function openNav() {\n");
      out.write("                  document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                function closeNav() {\n");
      out.write("                  document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </div>\n");
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
