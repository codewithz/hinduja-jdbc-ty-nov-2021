import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

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
		
		String query="Select name,dept,id,salary,doj from employee";
		
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next()) {
			
			String name=rs.getString("name");
			int id=rs.getInt("id");
			String dept=rs.getString("dept");
			String doj=rs.getString("doj");
			float salary=rs.getFloat("salary");
			
			System.out.println("---------------------------------------------------------------");
			System.out.println("ID:"+id+" | Name:"+name+" | Dept:"+dept+" | Salary:"+salary+" | DOJ:"+doj);
			System.out.println("---------------------------------------------------------------");
			
		}
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
