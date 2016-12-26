package loginRegister;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void wrong1(){
		String m="不允许有空,注册失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
	public void wrong2(){
		String m="两次密码不同，注册失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
	public void wrong3(){
		String m="用户名已存在，注册失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
	
       
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("username");
		String password1=request.getParameter("password1");
		String password2=request.getParameter("password2");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String birth=request.getParameter("year")+"-"+request.getParameter("month")+"-"+request.getParameter("day");
		String nation=request.getParameter("nation");
		String edu=request.getParameter("edu");
		String work=request.getParameter("work");
		String phone=request.getParameter("phone");
		String place=request.getParameter("place");
		String emall=request.getParameter("emall");
		if(username.length()==0||password1.length()==0||
			password2.length()==0||name.length()==0||phone.length()==0||emall.length()==0){
			wrong1();
			response.sendRedirect("../register/register.jsp");
		}else if(!(password1.equals(password2))){
			wrong2();
			response.sendRedirect("../register/register.jsp");
		}else{
			try{
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String url="jdbc.sqlserver://localhost:1433;databaseName=persion";
				con=DriverManager.getConnection(url,"sa","133113");
				stmt=con.createStatement();
				String sql1="";
			}catch(Exception e){
				System.out.print(e);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
