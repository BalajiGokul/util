package com.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection 
{
		public static Connection getDB() throws ClassNotFoundException, SQLException
		{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection c = DriverManager.getConnection("jdbc:derby://172.24.18.102:1527/balaji;create=trues","balaji","balaji");
			return c;
		}
}