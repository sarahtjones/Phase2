import java.io.BufferedReader;
import java.util.*;
import java.sql.*;
import java.io.*;

public class BisonMaps {
	
	public static void main(String[] args) {
			//Prompt user to select menu option
			int selection=0; 
			while (selection != 6){
			System.out.println("1. Get Directions\n2. Find Campus Resources\n3. Display Campus Building Names\n4. Display all Campus Building Names\n5. Display all Department Locations\n6. Exit"); 
			System.out.print("Enter (1-6): ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br4 = new BufferedReader(isr);
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "jdbc:postgresql://ec2-54-225-243-113.compute-1.amazonaws.com:5432/ddg45rtfmiq736";  
			
			Properties props = new Properties(); 
			props.setProperty("user", "zndpxoeidabzky"); 
			props.setProperty("password", "YLjKDCb6Ldas2qBpWbDxJ7aIn3"); 
			props.setProperty("ssl", "true");
			props.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
			// connect to the database
			GetData name = new GetData();
			GetData atms = new GetData();
			GetData department = new GetData();
				//FUNCTIONS!!
			
			
			try{
			selection = br4.read(); 
			}
			catch(IOException ioe) {
				System.out.println("Please type a number 1-6!");
				System.exit(1);
			}
			
			
			switch(selection) 
			{
			case 49: {	//ASCII Value of 1
							
							System.out.print("Enter Starting Location (Building): "); 
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							String start = null;
							try {
								start = br.readLine();
							} catch (IOException ioe) {
								System.out.println("IO error trying to read your input");
								System.exit(1);
							}
							System.out.print("Enter Destination Location (Building): "); 
							BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
							String destination = null;
							try {
								destination = br2.readLine();
							} catch (IOException ioe) {
								System.out.println("IO error trying to read your input");
								System.exit(1);
							}
							break;
						}
			case 50: {		//ASCII value of 2
							System.out.println("1. ATM\n2. Public Phone\n3. WiFi Hot Spot\n4. Security Phone, Guard Station\n5. Vending Machine\n6. Rest Room\n7. Shuttle Bus Stop\n8. Computer Lab\n9. Previous Menu\nEnter Resource(1 - 9):");
							//BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
							int resource = 0;
							InputStreamReader isr9 = new InputStreamReader(System.in);
							BufferedReader br9 = new BufferedReader(isr);
							try{
								resource = br9.read(); 
								}
								catch(IOException ioe) {
									System.out.println("Please type a number 1-!");
									System.exit(1);
								}
							String originLocation = null;
//							try {
//								originLocation = br3.readLine();
//							} catch (IOException ioe) {
//								System.out.println("IO error trying to read your input");
//								System.exit(1);
//							}
							System.out.print("Enter Origin Location (Building); "); 
							BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
							String destination1 = null;
							try {
								destination1 = br5.readLine();
							} catch (IOException ioe) {
								System.out.println("IO error trying to read your input");
								System.exit(1);
							}
							break;
						}
			case 51: {	//ASCII value of 3
						name.getName(url, props);
						break;
					}
			case 52: { //ASCII value of 4
						atms.getFeatures(url, props);
						break;
			}
			case 53: { //ASCII value of 5
						department.getDepartmentLocation(url, props);
						break;
			}
			case 54: { //ASCII value of 6
					System.out.println("Thank You for using our map!");
					return;
			}
			default: 	
				System.out.println("Please enter a Valid number 1-6!"); 
			}
		}
	}
}
	
		
		//	System.out.print(selection);
			// TODO Auto-generated method stub
			//DataConnector DC = new DataConnector();
	

			
	

