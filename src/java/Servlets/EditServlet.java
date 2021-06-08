/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.DataController;
import Model.MainModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Edgar Hadhyra J
 */
public class EditServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            
            DataController dc = new DataController();
            MainModel model = dc.show(id);
            
            request.setAttribute("product", model);
            RequestDispatcher dispatch = request.getRequestDispatcher("/views/Update.jsp");
            dispatch.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String product = request.getParameter("product");
            String qty = request.getParameter("qty");
            String size = request.getParameter("size");
            String clothes = request.getParameter("clothes");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String phone = request.getParameter("phone");
            System.out.println("ID:" + id);
            System.out.println("nama:" + name);
            System.out.println("email:" + email);
            System.out.println("product:" + product);
            System.out.println("quantity:" + qty);
            System.out.println("size: " + size);
            System.out.println("clothes: " + clothes);
            System.out.println("address: " + address);
            System.out.println("city: " + city);
            System.out.println("state: " + state);
            System.out.println("phone: " + phone);
            
            MainModel model = new MainModel();
            model.setId(id);
            model.setName(name);
            model.setEmail(email);
            model.setProduct(product);
            model.setQty(Integer.parseInt(qty));
            model.setSize(size);
            model.setClothes(clothes);
            model.setAddress(address);
            model.setCity(city);
            model.setState(state);
            model.setPhone(Integer.parseInt(phone));
            
            DataController dc = new DataController();
            boolean check = dc.update(model);
            
            if(check){
                response.sendRedirect("data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
