import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ConsultationDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
    	static String uname = "admin";
    	static String pass = "CSETeam12";
	
	// Main
	public static void main(String[] args) throws Exception
	{
		
		// String temp = ConsultationDatabase.getAllergy("kagg45");
		// System.out.println(temp);
		
		// ConsultationDatabase.setNotes("kagg45","notes");
	}
	
	// Getters
	public static double getWeight(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Weight FROM OfficeAutomation.Consultation WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		double weight = rs.getDouble("Weight");
		st.close();
		con.close();
		return weight;
	}
	
	public static double getHeight(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Height FROM OfficeAutomation.Consultation WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		double height = rs.getDouble("Height");
		st.close();
		con.close();
		return height;
	}
	
	public static String getNotes(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Notes FROM OfficeAutomation.Consultation WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String notes = rs.getString("Notes");
		st.close();
		con.close();
		return notes;
	}
	
	public static double getTemperature(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Temperature FROM OfficeAutomation.Consultation WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		double temp = rs.getDouble("Temperature");
		st.close();
		con.close();
		return temp;
	}
	
	public static String getBloodPressure(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Blood_Pressure FROM OfficeAutomation.Consultation WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String blood_pressure = rs.getString("Blood_Pressure");
		st.close();
		con.close();
		return blood_pressure;
	}
	
	public static Boolean checkExistance(String user_name) throws ClassNotFoundException, SQLException {
		String query = "SELECT EXISTS(SELECT * FROM OfficeAutomation.Consultation WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}
	
	// Setters
	public static void setWeight(String user_name, double weight) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE OfficeAutomation.Consultation SET Weight = \"" + weight + "\"  WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setHeight(String user_name, double height) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE OfficeAutomation.Consultation SET Height = \"" + height + "\"  WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNotes(String user_name, String notes) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE OfficeAutomation.Consultation SET Notes = \"" + notes + "\"  WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setTemperature(String user_name, double temp) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE OfficeAutomation.Consultation SET Temperature = \"" + temp + "\"  WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setBloodPressure(String user_name, String blood_pressure) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE OfficeAutomation.Consultation SET Blood_Pressure = \"" + blood_pressure + "\"  WHERE Patient_Username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	
	// Insert Nurse
	public static void InsertConsultation(double weight, double height, String notes, double temp, String blood_pressure, String patient_username) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO OfficeAutomation.Consultation VALUES(?,?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		
		st.setDouble(1, weight);
		st.setDouble(2, height);
		st.setString(3, notes);
		st.setDouble(4, temp);
		st.setString(5, blood_pressure);
		st.setString(6, patient_username);
		
		st.executeUpdate();
		
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
	}
}

// Insert function (Completed)
// Primary Key Username
// IsUsername
