package com.Xworkz.treeRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.Xworkz.treeDto.TreeDto;

public class TreeRepoImpl implements TreeRepo {

	@Override
	public boolean save(TreeDto dto) {
		String username="root";
		String password="Xworkzodc@123";
		String host="jdbc:mysql://localhost:3306/sep_08";
		
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(host, username, password);
		
		String query = "INSERT INTO tree_info VALUES(?,?,?,?,?)";
		
		PreparedStatement statement=connection.prepareStatement(query);
		
		statement.setInt(1, 3);
		statement.setString(2, "Mango");
		statement.setString(3, "yellow");
		statement.setString(4, "250m");
		statement.setString(5, "25m");
		
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
