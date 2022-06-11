package MySQLDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLClasses {
	
	public static void main(String[] args) throws SQLException {
		//1.create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db","root","root");
		//2.create statment
		Statement stmt = con.createStatement();
		
		//String s = "INSERT INTO imgCnt VALUES('COLLEGE',1001)";
//		 String s ="UPDATE imgCnt SET department='corporate' where em_no=100";
//		String s ="DELETE FROM imgCnt where department='COLLEGE'";
//		String s = "alter table imgCnt add Governance varchar(30)";
		
		String s = "update imgCnt set Governance='private sector'where em_no=100";
		String t = "update imgCnt set Governance='public sector'where em_no=101";
		String u = "update imgCnt set Governance='public sector'where em_no=1908";
		
		
		//3. excute query
		stmt.execute(s);
		stmt.execute(t);
		stmt.execute(u);
		
		//4.close connection
		con.close();
		
		System.out.println("Query excuted....");
	}

}
