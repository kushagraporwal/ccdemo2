package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.demo.dao.fetchdao;

/**
 * Servlet implementation class fetching
 */
public class fetching extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		fetchdao dao= new fetchdao();
		if(dao.check(uname, pass))
		{
			HttpSession session= request.getSession();
			session.setAttribute("daolist", dao.alist);
			response.sendRedirect("welcome2.jsp");
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
		
	}

	
}
