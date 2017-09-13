package co.edu.uptc.sw2.taller3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            String name = request.getParameter("name");
            String lastname = request.getParameter("lastname");
            Integer age = Integer.parseInt(request.getParameter("age"));
            out.println("Bienvenido, " + name + " " + lastname
                    + ", usted es " + (age > 17 ? "mayor" : "menor") + " de edad");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
