package com.Xworkz.watch.util;

import java.sql.Connection;
import java.sql.DriverManager;
import com.Xworkz.watch.constants.SqlCredentials;

public class DBUtil {
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());
			return connection;
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
