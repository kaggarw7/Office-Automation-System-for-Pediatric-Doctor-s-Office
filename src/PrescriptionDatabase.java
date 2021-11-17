import java.sql.*;


public class PrescriptionDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
	static String uname = "admin";
	static String pass = "CSETeam12";
	
		///////////////////////////////// Getter Functions  ////////////////////////////////////
			
		public static String getMedicine(String user_name) throws Exception
		{
		String query = "SELECT Medicine FROM OfficeAutomation.Prescription where patient_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();  
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String medicine = rs.getString("Medicine"); 
		st.close();
		con.close();
		return (medicine);
		}
		
		
		public static String getFrequency(String user_name) throws Exception
		{
		String query = "SELECT Frequency FROM OfficeAutomation.Prescription where patient_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();  
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String frequency = rs.getString("Frequency"); 
		st.close();
		con.close();
		return (frequency);
		}
		
		public static String getDosage(String user_name) throws Exception
		{
		String query = "SELECT Dosage FROM OfficeAutomation.Prescription where patient_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();  
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String dosage = rs.getString("Dosage"); 
		st.close();
		con.close();
		return (dosage);
		}
		
		
		///////////////////////////////// Setter Functions ////////////////////////////////////
		
		
		public static void setMedicine(String user_name, String medicine) throws ClassNotFoundException, SQLException
	    {
	        String query = "UPDATE OfficeAutomation.Prescription SET Medicine = \"" + medicine + "\"  WHERE patient_username = \"" + user_name + "\"";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try(Connection con = DriverManager.getConnection(url, uname, pass);
	                Statement st = con.createStatement();) {

	             st.executeUpdate(query);
	             System.out.println("Database updated successfully ");
	        } catch (SQLException e) {
	              e.printStackTrace();
	        }
	    }
		
		
		public static void setFrequency(String user_name, int frequency) throws ClassNotFoundException, SQLException
	    {
	        String query = "UPDATE OfficeAutomation.Prescription SET Frequency = \"" + frequency + "\"  WHERE patient_username = \"" + user_name + "\"";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try(Connection con = DriverManager.getConnection(url, uname, pass);
	                Statement st = con.createStatement();) {

	             st.executeUpdate(query);
	             System.out.println("Database updated successfully ");
	        } catch (SQLException e) {
	              e.printStackTrace();
	        }
	    }
		
		
		public static void setDosage(String user_name, int dosage) throws ClassNotFoundException, SQLException
	    {
	        String query = "UPDATE OfficeAutomation.Prescription SET Dosage = \"" + dosage + "\"  WHERE patient_username = \"" + user_name + "\"";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try(Connection con = DriverManager.getConnection(url, uname, pass);
	                Statement st = con.createStatement();) {

	             st.executeUpdate(query);
	             System.out.println("Database updated successfully ");
	        } catch (SQLException e) {
	              e.printStackTrace();
	        }
	    }
		
		
		///////////////////////////////// ------------- ////////////////////////////////////
				
		public static void InsertPrescription(String Medicine, int frequency, int dosage) throws ClassNotFoundException, SQLException
		{
		String query = "INSERT INTO OfficeAutomation.Patient VALUES(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		
		st.setString(1, Medicine);
		st.setInt(2, frequency);
		st.setInt(3, dosage);
		st.executeUpdate();
		
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
		}

}
