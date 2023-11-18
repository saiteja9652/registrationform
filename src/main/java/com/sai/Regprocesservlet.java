package com.sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet("/Regprocesservlet")
public class Regprocesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Regprocesservlet() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting the data and storing in string format
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String[] qualifications = request.getParameterValues("qualification");
		String finalQual = String.join(",", qualifications);
		
		String gender = request.getParameter("gender");
		
		String[] technologies = request.getParameterValues("technologies");
		String finalTech = String.join(",", technologies);
		
		String type = request.getParameter("type");
		
		String[] address = request.getParameterValues("address");
		String finalAddr = String.join("-", address);
		
		String comments = request.getParameter("comments");
		
		//storing whole data in an object
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setQualifications(finalQual);
		user.setGender(gender);
		user.setTechnologies(finalTech);
		user.setType(type);
		user.setAddress(finalAddr);
		user.setComments(comments);
		
		//giving data to userdao layer
		UserDao dao = new UserDao();
		dao.saveUser(user);
		
		//giving response to jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("Regproces.jsp");
		dispatcher.forward(request, response);
	}
	}


