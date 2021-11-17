import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class NurseDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
    	static String uname = "admin";
    	static String pass = "CSETeam12";
	
	// Main
	public static void main(String[] args) throws Exception
	{
		//NurseDatabase.InsertNurse("Aryan", "Aggarwal", 20, 96, 2021, "CITY", 789456123, "kagg", "123456");
	}
	
	// Getters
	public static String getNurseFirstName(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT First_name FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static String getNurseLastName(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Last_name FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static int getNurseBirthDay(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Birth_day FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static int getNurseBirthMonth(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Birth_month FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static int getNurseBirthYear(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Birth_year FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static String getNurseAddress(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Address FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static String getNursePhoneNumber(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Phone_number FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	
	public static String getNursePassword(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Nurse_password FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String password = rs.getString("Nurse_password");
		st.close();
		con.close();
		return password;
	}

	public static Boolean checkExistence(String user_name) throws ClassNotFoundException, SQLException {
		String query = "SELECT EXISTS(SELECT * FROM Nurse WHERE Nurse_username = \"" + user_name + "\"";
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
	public static void setNurseFirstName(String user_name, String first_name) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET First_name = \"" + first_name + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNurseLastName(String user_name, String last_name) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Last_name = \"" + last_name + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNurseBirthDay(String user_name, int birth_day) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Birth_day = \"" + birth_day + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNurseBirthMonth(String user_name, int birth_month) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Birth_month = \"" + birth_month + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNurseBirthYear(String user_name, int birth_year) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Birth_year = \"" + birth_year + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNurseAddress(String user_name, String address) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Address = \"" + address + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNursePhoneNumber(String user_name, String phone_number) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Phone_number = \"" + phone_number + "\"  WHERE Nurse_username = \"" + user_name + "\"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();) {
			
			 st.executeUpdate(query);
			 System.out.println("Database updated successfully ");
		} catch (SQLException e) {
		      e.printStackTrace();
	    }	
	}
	
	public static void setNursePassword(String user_name, String password) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE NURSE SET Nurse_password = \"" + password + "\"  WHERE Nurse_username = \"" + user_name + "\"";
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
	public static void InsertNurse(String first_name, String last_name, int birth_day, int birth_month, int birth_year, String address, String phone_number, String username, String password) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO NURSE VALUES(?,?,?,?,?,?,?,?,?)";
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
		st.setString(8, username);
		st.setString(9, password);
		
		st.executeUpdate();
		
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
	}
}

// Insert function (Completed)
// Primary Key Username
// IsUsername
