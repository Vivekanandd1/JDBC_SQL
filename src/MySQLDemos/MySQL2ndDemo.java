package MySQLDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL2ndDemo {
	
	public static void main(String[] args) throws SQLException {
		
		Connection cnnct = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db","root","root");
		
		Statement stmnt = cnnct.createStatement();
		
		String s = "SELECT country_id,country_name,region_id FROM countries";
		
		ResultSet rs = stmnt.executeQuery(s);
		
		while(rs.next())
		{
			String custname =rs.getString("country_id");
			int balance = rs.getInt("region_id");
			String actype = rs.getString("country_name");
			
			System.out.println(custname+"    "+balance+"     "+actype);
		}
		
		
	}

}
