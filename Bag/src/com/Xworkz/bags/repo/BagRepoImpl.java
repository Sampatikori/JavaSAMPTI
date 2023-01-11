package com.Xworkz.bags.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Xworkz.bags.dto.BagDto;
import com.Xworkz.shoes.dto.ShoeDto;
import com.Xworkz.bags.SqlCredentials;

public class BagRepoImpl implements BagRepo {

	@Override
	public boolean save(BagDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(),SqlCredentials.USERNAME.getValue(),SqlCredentials.PASSWORD.getValue());
			
			String query = "insert into bag_list values(?,?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getColour());
			statement.setInt(4, dto.getPrice());
			statement.setString(5, dto.getCapacity());
			
			statement.executeUpdate();
			statement.close();
			connection.close();
			
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public BagDto read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());
			
			String query="select*from bag_list where id=?";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setInt(1, 4);
			
			ResultSet set=statement.executeQuery();
			set.next();
			int id=set.getInt("id");
			String brandName=set.getString("brandName");
			String colour=set.getString("colour");
			int price=set.getInt("price");
			String capacity=set.getString("capacity");
			
//			System.out.println(id);
//			System.out.println(brandName);
//			System.out.println(colour);
//			System.out.println(price);
//			System.out.println(capacity);
			
		System.out.println("id : "+ id + " brandName: "+ brandName + " colour: "+ colour + " price : " + price + " capacity : " + capacity );	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	
		return null;
	}

	@Override
	public BagDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());
			
			String query="select*from bag_list where brandName=?";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setString(1, name);
			
			ResultSet set=statement.executeQuery();
			while(set.next()) {
			int id=set.getInt("id");
			String brandName=set.getString("brandName");
		    String colour=set.getString("colour");
			int price=set.getInt("price");
			String capacity=set.getString("capacity");
			
			BagDto dto=new BagDto(id, brandName, colour, price,capacity);
			return dto;
			}
			statement.close();
			connection.close();
          } catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	
		return null;
	}

	@Override
	public BagDto findByNameAndId(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());
			
			String query="select*from bag_list where brandName=? and id=?";
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setString(1, name);
			statement.setInt(2,id);
			
			ResultSet set=statement.executeQuery();
			
			while(set.next()) {
			int id1=set.getInt("id");
			String brandName=set.getString("brandName");
			String colour=set.getString("colour");
			int price=set.getInt("price");
			String capacity=set.getString("capacity");
			
			BagDto dto=new BagDto(id, brandName, colour, price, capacity);
			return dto;
			}
			statement.close();
			connection.close();
          } catch (Exception e) {
			
			e.printStackTrace();
		}
		return null; 
		
	
	
	}
}
