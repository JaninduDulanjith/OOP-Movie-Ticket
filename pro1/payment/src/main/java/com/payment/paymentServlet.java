package com.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class paymentServlet
 */
@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("pName");
		String Email = request.getParameter("pEmail");
		String Address = request.getParameter("pAddress");
		String City = request.getParameter("pCity");
		String Country_Region = request.getParameter("pCountry_Region");
		String Postcode = request.getParameter("pPostcode");
		String Name_on_card = request.getParameter("pName_on_card");
		String Credit_card_number= request.getParameter("pCredit card number ");
		String Exp_month  = request.getParameter("pExp_month ");
		String Exp_year = request.getParameter("pExp_year");
		String CVV = request.getParameter("pCVV");
		
		boolean isTrue;
	
		isTrue = paymentDButill.insertCustomer(name, Email, Address, City, Country_Region, Postcode,Name_on_card, Credit_card_number, Exp_month, Exp_year, CVV);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("successInfo.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}
	}

