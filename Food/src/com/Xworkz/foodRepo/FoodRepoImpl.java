package com.Xworkz.foodRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Xworkz.foodDto.FoodDto;

public class FoodRepoImpl implements FoodRepo {

	String username="root";
	String password="Xworkzodc@123";
	String host="jdbc:mysql://localhost:3306/sep_08";
	
	@Override
	public boolean save(FoodDto dto) {
		
		
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(host, username, password);
		
		String query = "INSERT INTO food_details VALUES(?,?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(query);
		
		statement.setInt(1, 1);
		statement.setString(2, "Dosa");
		statement.setString(3, "Gold");
		statement.setString(4, "Veg");
		statement.setInt(5, 30);
		
		statement.executeUpdate();
		statement.close();
		connection.close();
		
		
		return true;
	
	} catch (Exception e) {
		
		e.printStackTrace();
	
	}
	return false;

}

	
}