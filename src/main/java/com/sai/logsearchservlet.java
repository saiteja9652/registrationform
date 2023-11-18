package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logsearchservlet")
public class logsearchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		
		UserDao dao=new UserDao();
	User user=	dao.searchuser(username);
	
	request.setAttribute("user", user);
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("logsearch.jsp");
	dispatcher.forward(request, response);
	}

}
