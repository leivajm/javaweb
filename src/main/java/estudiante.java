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
            dbconexion conn = new dbconexion();
            conn.usuario = "usr";
            conn.pwd = "pass";
            producto producto1 = new producto();
            producto1.nombre = "marcador";
            producto1.descripcion = "para uso en pizarra blanca";
            producto1.precio = 5;
            producto1.cantidad = 2;
            int a = 10;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet estudiante</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejemplo de servlet en el proyecto:  " + request.getContextPath() + "</h1>");
            if(a>5)
            {
                out.println("<p>la variable a es mayor que 5</p>");
            }
            else
            {
                out.println("<p>la variable a es menor que 5</p>");
            }
            out.println("<h3>Imprimiendo producto</h3>");
            out.println("Nombre: " + producto1.nombre + "<br>");
            out.println("Descripcion: " + producto1.descripcion + "<br>");
            out.println("Precio: " + producto1.precio + "<br>");
            out.println("Cantidad: " + producto1.cantidad + "<br>");
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
