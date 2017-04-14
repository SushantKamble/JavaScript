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
 * Servlet implementation class ScopeDemo
 */
@WebServlet("/ScopeDemo")
public class ScopeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopeDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		ServletContext context=getServletContext();
		String name=request.getParameter("userName");
		if(name  !=null)
		{
			request.setAttribute("requestName", name);
			session.setAttribute("sessionName1", name);
			context.setAttribute("contextName", name);
		}
		
		out.println("request value "+request.getAttribute("requestName"));
		out.println("<br>");
		out.println("session value "+session.getAttribute("sessionName1"));
		out.println("<br>");
		out.println("context value "+context.getAttribute("contextName"));
		out.println("<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
