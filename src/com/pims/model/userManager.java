package com.pims.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class userManager {
	private user us;
	private Connection conn;
	//private Statement stmt;
	//private ResultSet rs;
	private PreparedStatement ps;
	
	public Connection getConnection(){
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://localhost:1433;databaseName=persion";
		String user="sa";
		String password="133113";
		
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void zhuce(user ur){
		String sql ="insert into userinfo(username,password1,password2,name,sex,birth,nation,edu,works,phone,place,emall) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		conn=getConnection();
		
		try{
			ps=conn.prepareStatement(sql);
			ps.setString(1, us.getUsername());
			ps.setString(2, us.getPassword1());
			ps.setString(3, us.getPassword2());
			ps.setString(4, us.getName());
			
			ps.setString(5, us.getSex());
			ps.setString(6, us.getBirth());
			ps.setString(7, us.getNation());
			ps.setString(8, us.getEdu());
			ps.setString(9, us.getWork());
			ps.setString(10, us.getPhone());
			ps.setString(11, us.getPlace());
			ps.setString(12, us.getEmall());
			
			ps.executeUpdate();
			ps.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	

}
