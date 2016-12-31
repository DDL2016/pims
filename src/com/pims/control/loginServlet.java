package com.pims.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pims.model.login;
import com.pims.model.loginManager;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password1=request.getParameter("password1");
		
		login g=new login(username,password1);
		loginManager manager=new loginManager();
		manager.denglu(g);
		
		RequestDispatcher dis=request.getRequestDispatcher("/main/main.jsp");
		dis.forward(request, response);
	}

}
