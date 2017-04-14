package com.capgemini.mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
	/*	HttpSession session=request.getSession();
		
		session.setAttribute("sessionName", "sessionValue");
		
		out.println(session.getAttribute("sessionName"));
		out.println("<br>");
		out.println(session.getId());
		out.println("<br>");
		out.println(session.getMaxInactiveInterval());
		out.println("<br>");
		out.println(session.isNew());*/
		String name=request.getParameter("userName");
		
		HttpSession session=request.getSession();
		ServletContext context=getServletContext();
		
		if(name!=null)
		{
			request.setAttribute("requestName",name );
			session.setAttribute("sessionName",name );
			context.setAttribute("contextName",name );
			
		}
		
		out.println("Request value = "+request.getAttribute("requestName"));
		out.println("Session value = "+session.getAttribute("sessionName"));
		out.println("context value = "+context.getAttribute("contextName"));
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
