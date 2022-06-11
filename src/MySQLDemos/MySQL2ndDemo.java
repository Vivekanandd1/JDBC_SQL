package MySQLDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL2ndDemo {
	
	public static void main(String[] args) throws SQLException {
		
		Connection cnnct = DriverManager.getConnection("jdbc:mysql://localhost:3306/jointac","root","root");
		
		Statement stmnt = cnnct.createStatement();
		
		String s = "SELECT CUSTNAME,BALANCE,ACTYPE FROM acdetails";
		
		ResultSet rs = stmnt.executeQuery(s);
		
		while(rs.next())
		{
			String custname =rs.getString("CUSTNAME");
			int balance = rs.getInt("BALANCE");
			String actype = rs.getString("ACTYPE");
			
			System.out.println(custname+"    "+balance+"     "+actype);
		}
		
		
	}

}
