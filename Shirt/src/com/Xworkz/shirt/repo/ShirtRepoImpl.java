package com.Xworkz.shirt.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Xworkz.shirt.dto.ShirtDto;
import com.Xworkz.shirt.util.DBUtil;

public class ShirtRepoImpl implements ShirtRepo {

	@Override
	public boolean save(ShirtDto dto) {

		String query = "insert into shirt_info values(?,?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getSize());
			statement.setBoolean(5, dto.isHasPocket());

			statement.executeUpdate();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<ShirtDto> read() {
		String query = "select*from shirt_info";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			ResultSet set = statement.executeQuery();
			List<ShirtDto> list = new ArrayList<ShirtDto>();
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String colour = set.getString(3);
				String size = set.getString(4);
				boolean hasPocket = set.getBoolean(5);

				ShirtDto dto = new ShirtDto(id, name, colour, size, hasPocket);
				list.add(dto);
			}
			statement.close();
			connection.close();

			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ShirtDto findNameAndId(String name, int id) {
		String query = "select*from shirt_info where name=? and id=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, name);
			statement.setInt(2, id);

			ResultSet set = statement.executeQuery();
			set.next();
			int id1 = set.getInt(1);
			String name1 = set.getString(2);
			String colour = set.getString(3);
			String size = set.getString(4);
			boolean hasPocket = set.getBoolean(5);

			ShirtDto dto = new ShirtDto(id1, name1, colour, size, hasPocket);
			statement.close();
			connection.close();
			return dto;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateSizeByName(String size, String name) {
		String query = "update shirt_info set size=? where name=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, size);
			statement.setString(2, name);
			
			statement.executeUpdate();
			System.out.println("updated");
			statement.close();
			connection.close();
		 return true;
		 
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByColour(String colour) {
		String query = "delete from shirt_info where colour=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, colour);
			
			statement.executeUpdate();
			System.out.println("deleted by colour");
			statement.close();
			connection.close();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteBySizeAndName(String size, String name) {
		String query = "delete from shirt_info where size=? and name=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, size);
			statement.setString(2, name);
			
			statement.executeUpdate();
			System.out.println("deleted by size and name");
			statement.close();
			connection.close();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
