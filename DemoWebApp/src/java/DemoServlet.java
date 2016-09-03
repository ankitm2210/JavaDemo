
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankitmishra
 */
public class DemoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = "You are not registered user";
        
        ServletConfig sc=getServletConfig();
        
        ServletContext sco = getServletContext();
        
        sc.getInitParameter("name_conf");
        if("ankit".equals(name)){
           message = "you are registered user "+ sc.getInitParameter("name_conf") + " " + sco.getInitParameter("dbname");
        }
        //response.getOutputStream().print("<Html><body>\"ababa</body></html>");
        request.setAttribute("message", message);
        request.getRequestDispatcher("/user.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = "You are not registered user";
        if("ankit".equals(name)){
           message = "you are registered user";
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("/user.jsp").forward(request, response);
    }
    
}
