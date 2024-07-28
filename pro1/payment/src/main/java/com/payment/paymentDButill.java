package com.payment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class paymentDButill {
	


	    public static boolean insertCustomer(String name, String email, String address,
	            String city, String countryRegion, String postcode, String nameOnCard,
	            String creditCardNumber, String expMonth, String expYear, String cvv) {

	        boolean isSuccess = false;

	        // Create connection
	        String url = "jdbc:mysql://localhost:3306/payment";
	        String user = "root";
	        String pass = "";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver"); // Note the driver class name change
	            Connection con = DriverManager.getConnection(url, user, pass);
	            String sql = "INSERT INTO customer (name, Email, Address, City, Country_Region, Postcode, Name_on_card, Credit_card_number, Exp_month, Exp_year, cvv) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(sql);

	            // Set the values for the prepared statement
	            pstmt.setString(2, name);
	            pstmt.setString(3, email);
	            pstmt.setString(4, address);
	            pstmt.setString(5, city);
	            pstmt.setString(6, countryRegion);
	            pstmt.setString(7, postcode);
	            pstmt.setString(8, nameOnCard);
	            pstmt.setString(9, creditCardNumber);
	            pstmt.setString(10, expMonth);
	            pstmt.setString(11, expYear);
	            pstmt.setString(12, cvv);

	            int rowsInserted = pstmt.executeUpdate();

	            if (rowsInserted > 0) {
	                isSuccess = true;
	            }

	            con.close(); // Close the connection

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return isSuccess;
	    }
	}



