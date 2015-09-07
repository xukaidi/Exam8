package com.hand.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;

	@Override
	public String execute() throws Exception {

		System.out.println("login");
		Connection conn = com.hand.jdbc.ConnectionFactory.getInstance().getConnection();
		try{
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM customer WHERE first_name = ?");
		ps.setString(1, username);
		System.out.println(username);
		ResultSet rs = 	ps.executeQuery();
		while(rs.next()){
			return SUCCESS;
		}}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}finally {
			conn.close();
		}
		return ERROR;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
