/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author joseleiva
 */
@WebServlet(urlPatterns = {"/estudiante"})
public class estudiante extends HttpServlet {

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
            String producto = request.getParameter("producto");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet estudiante</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejemplo de servlet en el proyecto:  " + request.getContextPath() + "</h1>");
            switch(producto.toString())
            {
                case "1":
                    out.println("<h2>Producto: Agua pura</h2>");
                    out.println("<p>Precio: Q5.00</p>");
                    out.println("<img heigth=300 width=300  src=https://mcdonalds.com.gt/storage/menu-products/1640812488_Agua%20pura.jpg />");
                    break;
                case "2":
                    out.println("<h2>Producto: Celular</h2>");
                    out.println("<p>Precio: Q20,000.00</p>");
                    out.println("<img heigth=300 width=300 src=https://walmartgt.vtexassets.com/arquivos/ids/413881/Telefono-Celular-Apple-Iphone-15-128Gb-2-67145.jpg?v=638937250629770000 />");
                     
                default:
                    out.println("<h2>No hay producto registrado</h2>");
                    break;
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
