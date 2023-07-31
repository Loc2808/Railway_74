package loctran.DemoJDBC.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcUtils {
	
	private Connection con;
	
	public Connection getConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
	
	Properties pro = new Properties();
	
	pro.load(new FileInputStream("propertyData/appData.properties"));
	

	String username = pro.getProperty("username");
	String password = pro.getProperty("password");
	String url = pro.getProperty("url");
	String driver = pro.getProperty("driver");
	
	Class.forName(driver);
	
	con = DriverManager.getConnection(url, username, password);
	
	System.out.println("connect successfully!");
	
	
	return con;
	
	}
	
	public static void closeConnection(Connection con) {
		try {
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
