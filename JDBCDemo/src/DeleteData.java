import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
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
		
		String query="Delete from employee where id=4 or id=8";
		int rowAffected=stmt.executeUpdate(query);
		
		System.out.println("Rows Deleted:"+rowAffected);
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
