


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("This is eg of include");
			RequestDispatcher rd=req.getRequestDispatcher("secondServlet");
			rd.include(req, res);
			pw.close();
		}
		catch(Exception ae) {
		
	}


	}

}
