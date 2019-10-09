

import java.io.*;
import javax.servlet.Servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)  {
		try {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			String s=req.getParameter("t1");
			String t=req.getParameter("t2");
			pw.println("the username is"+s);
			pw.println("the password is"+t);
		}
	catch(Exception ae) {
		
	}
	}

}
