package com.mycompany.tp2_tableau_dynamique;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name="cs",urlPatterns={"/fs"})
public class TableauDynamique extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.getRequestDispatcher("vue.jsp").forward(request,response);
        }
        catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("Il faut saisir le nombre de lignes et le nombre de colonnes");
            out.println("</body>");
            out.println("</html>");
        }
    }
}