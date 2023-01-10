package com.Xworkz.shoes.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Xworkz.shoes.SqlCredentials;
import com.Xworkz.shoes.dto.ShoeDto;

public class ShoeRepoImpl implements ShoeRepo {

	@Override
	public boolean save(ShoeDto dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(),SqlCredentials.USERNAME.getValue(),SqlCredentials.PASSWORD.getValue());
			
			String query = "insert into shoe values(?,?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setInt(3, dto.getSize());
			statement.setString(4, dto.getColour());
			statement.setInt(5, dto.getPrice());
			
			statement.executeUpdate();
			statement.close();
			connection.close();
			
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public ShoeDto read() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());
			
			String query="select*from shoe where id=?";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setInt(1, 5);
			
			ResultSet set=statement.executeQuery();
			set.next();
			int id=set.getInt("id");
			String brandName=set.getString("brandName");
			int size=set.getInt("size");
			String colour=set.getString("colour");
			int price=set.getInt("price");
			
//			System.out.println(id);
//			System.out.println(brandName);
//			System.out.println(size);
//			System.out.println(colour);
//			System.out.println(price);
			
		System.out.println("id : "+id+ "brandName: "+brandName+ "size: "+size+ "colour: "+colour+ "price : "+price );	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	
		return null;
	}

	@Override
	public ShoeDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());
			
			String query="select*from shoe where brandName=?";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setString(1, name);
			
			ResultSet set=statement.executeQuery();
			set.next();
			int id=set.getInt("id");
			String brandName=set.getString("brandName");
			int size=set.getInt("size");
			String colour=set.getString("colour");
			int price=set.getInt("price");
			
			System.out.println("id : "+id+ " brandName: "+brandName+ " size: "+size+ " colour: "+colour+ " price : "+price );
		
          } catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	
		return null;
	}
}