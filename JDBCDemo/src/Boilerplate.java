import java.sql.*;

public class Boilerplate {
	
	public static void main(String[] args) {
		try {
			
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		String url="jdbc:mysql://localhost:3306/hinduja_2021";
		String username="root";
		String password="admin";
		
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Acquired Successfully");
		
		Statement stmt=con.createStatement();
		
		String query="";
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
