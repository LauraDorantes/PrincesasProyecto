/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerdoc.proyecto1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ldrnt
 */
@WebServlet(name = "Mayo", urlPatterns = {"/Mayo"})
public class Mayo extends HttpServlet {

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
            
            String url = "Menu.jsp";
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mayo</title>");            
            out.println("</head>");
            out.println("<body BGCOLOR = \"#FFF984\">");
            out.println("<center><h1 face = 'Luminari'><font size = '8' color = '#FFB500'>Bella</font></h1></center>");
            out.println("<center><table>\n" +
                            "<tr>\n" +
                            "<td><blockquote><img src=\"Bella.jpeg\" align = \"bottom\" width=\"290\" height=\"395\" alt=\"\" /></td>\n" +
                            "<td><blockquote><h2><center>Eres muy compasiva y cuidas de los necesitados. Puedes ser terca y siempre tratas de proteger a la gente que realmente amas. También eres muy paciente con los demás. Una soñadora y una verdadera amante de la fantasía y la aventura.</center></h2></td>\n" +
                            "</tr>\n" +
                            "</table></center>\n");
            out.println("<br><a href =\"" + url + "\"><img src=\"button_regresar.png\" align = \"right\"></a><br>");
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
