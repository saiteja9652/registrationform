package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		UserDao dao=new UserDao();
		boolean status= dao.checkuser(username,password);
		
		request.setAttribute("status", status);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("logincheck.jsp");
		dispatcher.forward(request, response);

		
		
	}

}
