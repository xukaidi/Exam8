package com.hand.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	private int id;

	public String delete() throws SQLException {

		System.out.println("delete");
		Connection conn = com.hand.jdbc.ConnectionFactory.getInstance()
				.getConnection();

		PreparedStatement preparedStatement;
		String sql = "delete from payment where customer_id=?";
		preparedStatement = conn.prepareCall(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		sql = "delete from rental where customer_id=?";
		preparedStatement = conn.prepareCall(sql);
		preparedStatement.setInt(1, id);

		preparedStatement.execute();

		sql = "delete from customer where customer_id=?";
		preparedStatement = conn.prepareCall(sql);
		preparedStatement.setInt(1, id);

		preparedStatement.execute();

		System.out.println("impDao删除成功");
		return SUCCESS;	

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
