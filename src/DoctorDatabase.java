import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class DoctorDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
    	static String uname = "admin";
    	static String pass = "CSETeam12";
	
	// Main
	public static void main(String[] args) throws Exception
	{
		//DoctorDatabase.InsertDoctor("Kartik", "Aggarwal", 30, 01, 2002, "India", 789456123, "Kagg", "Hello", "abis");
		
		//String first_name = DoctorDatabase.getDoctorNurseUsername("Kagg");
		//System.out.println(first_name);
		
		//DoctorDatabase.setDoctorNurseUsername("Kagg", "hhhhhh");
	}
	
	// Getters
	public static String getDoctorFirstName(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT First_name FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String first_name = rs.getString("First_name");
		st.close();
		con.close();
		return first_name;
	}
	
	public static String getDoctorLastName(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Last_name FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String last_name = rs.getString("Last_name");
		st.close();
		con.close();
		return last_name;
	}
	
	public static int getDoctorBirthDay(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Birth_day FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		int birth_day = rs.getInt("Birth_day");
		st.close();
		con.close();
		return birth_day;
	}
	
	public static int getDoctorBirthMonth(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Birth_month FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		int birth_month = rs.getInt("Birth_month");
		st.close();
		con.close();
		return birth_month;
	}
	
	public static int getDoctorBirthYear(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Birth_year FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		int birth_year = rs.getInt("Birth_year");
		st.close();
		con.close();
		return birth_year;
	}
	
	public static String getDoctorAddress(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Address FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String address = rs.getString("Address");
		st.close();
		con.close();
		return address;
	}
	
	public static String getDoctorPhoneNumber(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Phone_number FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String phone_number = rs.getString("Phone_number");
		st.close();
		con.close();
		return phone_number;
	}
	
	public static String getDoctorPassword(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Doctor_password FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String password = rs.getString("Doctor_password");
		st.close();
		con.close();
		return password;
	}
	
	public static String getDoctorNurseUsername(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Nurse_username FROM Doctor WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String nurse_username = rs.getString("Nurse_username");
		st.close();
		con.close();
		return nurse_username;
	}
	
	
	
	// Setters
	public static void setDoctorFirstName(String user_name, String first_name) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET First_name = \"" + first_name + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorLastName(String user_name, String last_name) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Last_name = \"" + last_name + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorBirthDay(String user_name, int birth_day) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Birth_day = \"" + birth_day + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorBirthMonth(String user_name, int birth_month) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Birth_month = \"" + birth_month + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorBirthYear(String user_name, int birth_year) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Birth_year = \"" + birth_year + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorAddress(String user_name, String address) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Address = \"" + address + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorPhoneNumber(String user_name, String phone_number) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Phone_number = \"" + phone_number + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorPassword(String user_name, String password) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Doctor_password = \"" + password + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setDoctorNurseUsername(String user_name, String nurse_username) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE Doctor SET Nurse_username = \"" + nurse_username + "\"  WHERE Doctor_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	// Insert Doctors
	public static void InsertDoctor(String first_name, String last_name, int birth_day, int birth_month, int birth_year, String address, String phone_number, String doctor_username, String doctor_password, String nurse_username) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO Doctor VALUES(?,?,?,?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		
		st.setString(1, first_name);
		st.setString(2, last_name);
		st.setInt(3, birth_day);
		st.setInt(4, birth_month);
		st.setInt(5, birth_year);
		st.setString(6, address);
		st.setString(7, phone_number);
		st.setString(8, doctor_username);
		st.setString(9, doctor_password);
		st.setString(10, nurse_username);
		
		st.executeUpdate();
		
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
	}
}
