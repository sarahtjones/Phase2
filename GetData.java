import java.util.*;
import java.sql.*;

public class GetData{

public String name;
public String sid;
public String atm;


		 public void getName(String url, Properties props){
			Connection conn;
			try {
				conn = DriverManager.getConnection(url,props);
			
			String query = "SELECT * FROM \"NODEDESCRIPTION\" WHERE \"TYPE\" = 0"; 	
				// create statement and execute query
				Statement stmt2 = conn.createStatement();
		
			ResultSet results = stmt2.executeQuery(query);  // return a result set
			while(results.next()){
			sid = results.getString("SID");
			name = results.getString("NAME");
			System.out.println("SID " + sid + ":" + " " + name);
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
				
		}
		 public void getFeatures(String url, Properties props){
			 Connection conn;
			 try {
				 conn = DriverManager.getConnection(url,props);
				 //ATMs
				 String query = "SELECT * FROM \"NODELAYER\" WHERE \'ATM\' >= '1'";
				 Statement stmt = conn.createStatement();
				 ResultSet results = stmt.executeQuery(query);
				 System.out.println("There are ATMs at the following SID locations: ");
				 while(results.next()){
					 sid = results.getString("SID");
					 System.out.print( sid + ", ");
				 }
				 //Vending Machine
				 String query1 = "SELECT * FROM \"NODELAYER\" WHERE \'VENDING\' >= '2'";
				 Statement stmt1 = conn.createStatement();
				 ResultSet results1 = stmt1.executeQuery(query);
				 System.out.println("\nThe are Vending Machine at the following SID location: ");
				 while(results1.next()){
					 sid = results1.getString("SID");
					 //atm = results.getString("ATM");
					 System.out.print( sid + ", ");
				 }
				 //RestRoon Machine
				 String query2 = "SELECT * FROM \"NODELAYER\" WHERE \'RESTROOM\' >= '2'";
				 Statement stmt2 = conn.createStatement();
				 ResultSet results2 = stmt2.executeQuery(query);
				 System.out.println("\nThere are bathrooms at the following SID location: ");
				 while(results2.next()){
					 sid = results2.getString("SID");
					 //atm = results.getString("ATM");
					 System.out.print( sid + ", ");
				 }
				//Public Phone Machine
				 String query3 = "SELECT * FROM \"NODELAYER\" WHERE \'RESTROOM\' >= '2'";
				 Statement stmt3 = conn.createStatement();
				 ResultSet results3 = stmt3.executeQuery(query);
				 System.out.println("\nThere are Public Phone at the following SID location: ");
				 while(results3.next()){
					 sid = results3.getString("SID");
					 System.out.print( sid + ", ");
				 }
				//Computer Labs Machine
				 String query4 = "SELECT * FROM \"NODELAYER\" WHERE \'COMPUTERLAB\' >= '2'";
				 Statement stmt4 = conn.createStatement();
				 ResultSet results4 = stmt4.executeQuery(query);
				 System.out.println("\nThere are bathrooms at the following SID location: ");
				 while(results3.next()){
					 sid = results2.getString("SID");
					 System.out.print( sid + ", ");
				 }
				//Computer WiFi
				 String query5 = "SELECT * FROM \"NODELAYER\" WHERE \'WIFI\' >= '1'";
				 Statement stmt5 = conn.createStatement();
				 ResultSet results5 = stmt5.executeQuery(query);
				 System.out.println("\nThere are bathrooms at the following SID location: ");
				 while(results3.next()){
					 sid = results2.getString("SID");
					 System.out.print( sid + ", ");
				 }
				//Computer Security
				 String query6 = "SELECT * FROM \"NODELAYER\" WHERE \'SECURITY\' >= '1'";
				 Statement stmt6 = conn.createStatement();
				 ResultSet results6 = stmt6.executeQuery(query);
				 System.out.println("\nThere are bathrooms at the following SID location: ");
				 while(results3.next()){
					 sid = results2.getString("SID");
					 System.out.print( sid + ", ");
				 }
				//Computer Bus Stop
				 String query7 = "SELECT * FROM \"NODELAYER\" WHERE \'BUSSTOP\' >= '1'";
				 Statement stmt7 = conn.createStatement();
				 ResultSet results7 = stmt7.executeQuery(query);
				 System.out.println("\nThere are bus stop at the following SID location: ");
				 while(results3.next()){
					 sid = results2.getString("SID");
					 System.out.print( sid + ", ");
				 }
///////////////////////////////////////////////////////////////////////////////////////////////////
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
					
		 }
		 public void getDepartmentLocation(String url, Properties props){
				Connection conn;
				try {
					conn = DriverManager.getConnection(url,props);
				
				String query = "SELECT * FROM \"DEPARTMENTLOCATION\""; 	
					// create statement and execute query
					Statement stmt2 = conn.createStatement();
			
				ResultSet results = stmt2.executeQuery(query);  // return a result set
				while(results.next()){
				sid = results.getString("SID");
				name = results.getString("DEPARTMENTNAME");
				System.out.println("SID " + sid + ":" + " " + name);
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		 }
}