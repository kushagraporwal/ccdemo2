package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class fetchdao {
	
	String sql= "select * from login";
	String url= "jdbc:mysql://localhost:3306/servletpractical";
	String username= "root";
	String password= "1234";
	
	
	public ArrayList<ArrayList<String>> alist;
	public boolean check(String uname, String pass)
	{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st= con.prepareStatement(sql);
			ResultSet rs= st.executeQuery();
			alist= new ArrayList<ArrayList<String>> ();
			while(rs.next())
			{
				ArrayList<String>arr= new ArrayList<String>();
				arr.add(rs.getString("uname"));
				arr.add(rs.getString("pass"));
				alist.add(arr);
			}
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
