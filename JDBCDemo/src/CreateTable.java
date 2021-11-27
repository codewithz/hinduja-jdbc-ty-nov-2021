import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
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
		
		String query="Create table test(id int,name varchar(100))";
		
		boolean created=stmt.execute(query);
		
		if(!created) {
			System.out.println("Table Created Successfully");
		}
		else {
			System.out.println("Table already exists");
		}
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
