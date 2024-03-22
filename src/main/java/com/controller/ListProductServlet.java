package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

public class ListProductServlet extends HttpServlet {

	// service -> X
	// doGet doPost{form method submit}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductDao productDao = new ProductDao();
		ResultSet rs = productDao.getAllProducts();

		if (rs == null) {
			// error page
		} else {
			request.setAttribute("rs", rs);
			RequestDispatcher rd = request.getRequestDispatcher("ListProduct.jsp");
			rd.forward(request, response);
		}

	}

}
