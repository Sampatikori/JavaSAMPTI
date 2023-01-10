package com.Xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcRunner {

	public static void main(String[] args) {
		
		String username="root";
		String password="Xworkzodc@123";
		String host="jdbc:mysql://localhost:3306/sep_08";
		
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(host, username, password);
		
		String query = "INSERT INTO students_list VALUES(?,?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(query);
		
//		statement.setInt(1, 1);
//		statement.setString(2, "Smita");
//		statement.setString(3, "3PD18IP012");
//		statement.setString(4, "IPE");
//        statement.setString(5, "3rd sem");	
        
		statement.setInt(1, 2);
		statement.setString(2, "Sunita");
		statement.setString(3, "3PD18CS012");
		statement.setString(4, "CSE");
		statement.setString(5, "5th sem");
//		
//		statement.setInt(1, 3);
//		statement.setString(2, "Bassu");
//		statement.setString(3, "3PD19ME011");
//		statement.setString(4, "ME");
//		statement.setString(5, "8th sem");
//		
//		statement.setInt(1, 4);
//		statement.setString(2, "Preeti");
//		statement.setString(3, "3PD18IS012");
//		statement.setString(4, "ISE");
//		statement.setString(5, "2nd sem");
//		
//		statement.setInt(1, 5);
//		statement.setString(2, "Arun");
//		statement.setString(3, "3PD18EE016");
//		statement.setString(4, "EEE");
//		statement.setString(5, "4th sem");
		
		statement.executeUpdate();
		
		
		statement.close();
		connection.close();
		
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
