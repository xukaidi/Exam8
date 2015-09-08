package com.hand.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hand.jdbc.ConnectionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {

	int PAGESIZE = 10;
	int curPage = 1;

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public void show() throws IOException {
		System.out.println("show");
		System.out.println(curPage);
		JsonObject lan = null;
		JsonArray jArray = new JsonArray();
		try {
			Connection con = ConnectionFactory.getInstance().getConnection();
			String sql = "SELECT first_name,last_name,email,customer_id,last_update,address_id FROM customer limit "+(curPage-1)*PAGESIZE+","+PAGESIZE;
			PreparedStatement stat;
			stat = con.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stat.executeQuery();
			while (rs.next()) {
				lan = new JsonObject();
				lan.addProperty("first_name", rs.getString(1));
				lan.addProperty("last_name", rs.getString(2));
				lan.addProperty("email", rs.getString(3));
				lan.addProperty("customer_id", rs.getInt(4));
				lan.addProperty("last_update", rs.getString(5));
				lan.addProperty("address_id", rs.getInt(6));
				
				//拿取地址
				String sql1 = "SELECT address_id,address FROM address where address_id="+rs.getInt(6);
				PreparedStatement stat1 = con.prepareStatement(sql1,
						ResultSet.TYPE_FORWARD_ONLY,
						ResultSet.CONCUR_READ_ONLY);
				ResultSet rs1 = stat1.executeQuery();
				while (rs1.next()) {
					int addressid = rs1.getInt(1);
					String address = rs1.getString(2);
					lan.addProperty("address", rs1.getString(2));
				}
				jArray.add(lan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpServletResponse response = ServletActionContext.getResponse();

		String customer = jArray.toString();
		response.getWriter().write(customer);
		System.out.println(customer);
		// return customer;
	}

}
