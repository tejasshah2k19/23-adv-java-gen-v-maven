package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

public class ProductDao {

	public int addProduct(String name, String category, int price, int qty) {
		int record = 0;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/vd";
			String userName = "root";
			String password = "root";
			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);

			PreparedStatement pstmt = con
					.prepareStatement("insert into products (productName,category,price,qty) values (?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, category);
			pstmt.setInt(3, price);
			pstmt.setInt(4, qty);

			record = pstmt.executeUpdate();// 1

		} catch (Exception e) {
			e.printStackTrace();
		}

		return record;
	}

	public ResultSet getAllProducts() {
		// db connection

		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/vd";
			String userName = "root";
			String password = "root";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, userName, password);

			PreparedStatement pstm = con.prepareStatement("select * from products");
			ResultSet rs = pstm.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
