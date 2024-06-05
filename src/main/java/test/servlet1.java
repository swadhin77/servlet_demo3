package test;
import java.io.*;
import jakarta.servlet.*;
@SuppressWarnings("serial")
public class servlet1 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String nm=req.getParameter("name");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome "+nm+" to java tutorial<br>");
		pw.println("<a href='servlet2?user="+nm+"'>Go to 2ns Servlet");
	}

}
