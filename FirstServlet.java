import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;



//@WebServlet(urlPatterns={"/firstservlet"}) 
public class FirstServlet extends HttpServlet {
 public void service( HttpServletRequest request, 
HttpServletResponse response ) 
 throws ServletException, IOException { 
response.setContentType( "text/html" ); 
PrintWriter out = response.getWriter(); 
out.println( "<html><body>" ); 
out.println( "<h1>Bonjour Clara Chelala</h1>" ); 
out.println( "</body></html>" ); 
 } 
}
