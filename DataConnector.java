import java.util.*;
import java.sql.*;

public class DataConnector {
	

	public DataConnector() {
		try
		{
			//     CONNECT TO DATABASE
			// check for jdbc driver  

			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://ec2-54-225-243-113.compute-1.amazonaws.com:5432/ddg45rtfmiq736";  
			
			Properties props = new Properties(); 
			props.setProperty("user", "zndpxoeidabzky"); 
			props.setProperty("password", "YLjKDCb6Ldas2qBpWbDxJ7aIn3"); 
			props.setProperty("ssl", "true");
			props.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
			// connect to the database

			Connection conn = DriverManager.getConnection(url,props); 
			// build the query and get result from result set
			
			String query = "SELECT * FROM \"NODEDESCRIPTION\" WHERE \"TYPE\" = 0"; 	
			// create statement and execute query
			Statement stmt2 = conn.createStatement();
		
			ResultSet rs2 = stmt2.executeQuery(query);  // return a result set
			
			
			//step through all records in the result set and print contents
		
			//while(rs2.next()) {
			
				//String sid = rs2.getString("SID");
				//
				//String desc = rs2.getString("Description");
				//
				//System.out.println("SID = " + sid +  " Description = " + desc);
			
			//******************************************************

			// close the database connection

//			conn.close();

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

//public String getName()
//{
//			Connection conn = DriverManager.getConnection(url,props); 
//			// build the query and get result from result set
//			
			String query = "SELECT * FROM \"NODEDESCRIPTION\" WHERE \"TYPE\" = 0"; 	
//			// create statement and execute query
			//Statement stmt2 = conn.createStatement();
//		
//			ResultSet rs2 = stmt2.executeQuery(query);  // return a result set
//		
//			//step through all records in the result set and print contents
//		
//			//while(rs2.next()) {
//			
//			String name = rs2.getString("NAME");
//			 
//				//System.out.println(name); 
//			//}
//				//
//				//String desc = rs2.getString("Description");
//				//
//				//System.out.println("SID = " + sid +  " Description = " + desc);
//			
//			//******************************************************
//
//			// close the database connection
//
//			//conn.close();
//			
//			return name;
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
	
}



