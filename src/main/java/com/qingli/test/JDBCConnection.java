package com.qingli.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {
	static String user;
	static String password;
	static String url;
	static {
		Properties properties = new Properties();
		InputStream resourceAsStream = JDBCConnection.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			properties.load(resourceAsStream);
			password = properties.getProperty("jdbc.password");
			url = properties.getProperty("jdbc.jdbcUrl");
			user = properties.getProperty("jdbc.user");
			System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws SQLException{
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
		return connection;
		
	}
	public static void main(String[] args) throws SQLException {
		getConnection();
	}

}
