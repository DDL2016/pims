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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void wrong1(){
		String m="�û�������Ϊ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
	public void wrong2(){
		String m="�û����벻��Ϊ��,��¼ʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
	public void wrong3(){
		String m="���û���δע��,��¼ʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
	public void wrong4(){
		String m="�û����벻��ȷ����¼ʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null, m,title,type);
	}
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName=request.getParameter("uname");
		String password=request.getParameter("upass");
		if(userName.equals("")){
			wrong1();
			response.sendRedirect("/log.jsp");
		}else if(password.equals("")){
			wrong2();
			response.sendRedirect("/log.jsp");
		}else{
			try{
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc.sqlserver://localhost:1433;databaseName=persion";
			con=DriverManager.getConnection(url,"sa","133113");
			stmt=con.createStatement();
			String sql="slecte * from userinfo z";
			}catch(Exception e){
				System.out.print(e);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
