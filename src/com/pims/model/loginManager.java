package com.pims.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginManager {
	private login g;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
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
	public void denglu(login g){
		String sql="select * from logininfo where username=?";
		conn=getConnection();
		try {
			rs=stmt.executeQuery(sql);
			rs.close();
			stmt.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
