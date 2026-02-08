package healthclinic.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private final static String URL = "jdbc:mysql://localhost:3306/Health_Clinic";
	private final static String USER = "root";
	private final static String PASSWORD = "Vishu@sql123";
	
	private DBConnection(){
		
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
