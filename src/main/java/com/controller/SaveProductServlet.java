package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;
import com.util.Validator;

@WebServlet("/SaveProductServlet")
public class SaveProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// read
		String name = request.getParameter("name");
		String qty = request.getParameter("qty");
		String category = request.getParameter("category");
		String price = request.getParameter("price");

		// validation
		boolean isError = false;
		if (Validator.isBlank(name) == true) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Product Name");
		} else {
			request.setAttribute("nameValue", name);
		}

		if (Validator.isBlank(qty)) {
			isError = true;
			request.setAttribute("qtyError", "Please Enter Qty");
		} else {
			request.setAttribute("qtyValue", qty);
		}
		//
		if (isError == true) {
			// goback
			RequestDispatcher rd = request.getRequestDispatcher("AddProduct.jsp");
			rd.forward(request, response);
		} else {
			// db insert
			// db connection
			// prepared statment
			
			int iQty = Integer.parseInt(qty);
			int iPrice = Integer.parseInt(price);
			
			ProductDao productDao = new ProductDao();//core java 
			int record = productDao.addProduct(name, category, iPrice, iQty);
			
			// query execute
			//
		}
	}

}
