package com.Xworkz.soap.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Xworkz.soap.constants.SqlCredentials;
import com.Xworkz.soap.dto.SoapDto;
import com.mysql.cj.xdevapi.Statement;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "insert into soap_list values(?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getFragrance());
			statement.setInt(5, dto.getWeightInGrams());
			statement.setString(6, dto.getManufacturedate());
			statement.setString(7, dto.getType());
			statement.setInt(8, dto.getPrice());

			statement.executeUpdate();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<SoapDto> readAll() {
		List<SoapDto> list = new ArrayList<SoapDto>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "select*from soap_list";
			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet set = statement.executeQuery();
			while (set.next()) {

				int id = set.getInt(1);
				String name = set.getString(2);
				String colour = set.getString(3);
				String fragrance = set.getString(4);
				int weightInGrams = set.getInt(5);
				String manufacturedate = set.getString(6);
				String type = set.getString(7);
				int price = set.getInt(8);

				SoapDto dtos = new SoapDto(id, name, colour, fragrance, weightInGrams, manufacturedate, type, price);
				list.add(dtos);
			}
			statement.close();
			connection.close();

			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto findByNameAndPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "select*from soap_list where name=? and price=?";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);

			ResultSet set = statement.executeQuery();

			set.next();

			int id = set.getInt("id");
			String name1 = set.getString("name");
			String colour = set.getString("colour");
			String fragrance = set.getString("fragrance");
			int weightInGrams = set.getInt("weightInGrams");
			String manufacturedate = set.getString("manufacturedate");
			String type = set.getString("type");
			int price1 = set.getInt("price");

			SoapDto sd = new SoapDto(id, name1, colour, fragrance, weightInGrams, manufacturedate, type, price1);
			statement.close();
			connection.close();
			return sd;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateNameByPrice(String name, int price) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "update soap_list set name=? where price=?";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);

			statement.executeUpdate();

			statement.close();
			connection.close();

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateColourAndFragranceByName(String colour, String fragrance, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "update soap_list set colour=? ,fragrance=? where name=?";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, colour);
			statement.setString(2, fragrance);
			statement.setString(3, name);
			statement.executeUpdate();

			statement.close();
			connection.close();

			return true;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateTypeById(String type, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "update soap_list set type=? where id=?";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, type);
			statement.setInt(2, id);

			statement.executeUpdate();

			statement.close();
			connection.close();

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
