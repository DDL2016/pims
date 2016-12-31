package com.pims.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pims.model.user;
import com.pims.model.userManager;

@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userServlet() {
        super();
    }

	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password1=request.getParameter("password1");
		String password2=request.getParameter("password2");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String birth=request.getParameter("year")+"-"+request.getParameter("month")+"-"+request.getParameter("day");
		String nation=request.getParameter("nation");
		String edu=request.getParameter("edu");
		String works=request.getParameter("works");
		String phone=request.getParameter("phone");
		String place=request.getParameter("place");
		String emall=request.getParameter("emall");
		
		user u=new user(username,password1,password2,name,sex,birth,nation,edu,works,phone,place,emall);
		userManager manager=new userManager();
		
		manager.zhuce(u);
		
		String info="用户添加成功";
		request.setAttribute("info", info);
		
		RequestDispatcher dis=request.getRequestDispatcher("/register/success.jsp");
		dis.forward(request, response);
	}

}
