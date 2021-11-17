import java.sql.*;


public class AppointmentDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
	static String uname = "admin";
	static String pass = "CSETeam12";
	
	
	///////////////////////////////// Getter Functions  ////////////////////////////////////
	
	public static String getDate(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Date FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String date = rs.getString("Date"); 
	    st.close();
	    con.close();
	    return (date);
	}
	
	
	
	public static int getHours(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Hours FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int hours = Integer.parseInt(rs.getString("Hours")); 
	    st.close();
	    con.close();
	    return (hours);
	}
	
	
	public static int getMinutes(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Minutes FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int mins = Integer.parseInt(rs.getString("Minutes")); 
	    st.close();
	    con.close();
	    return (mins);
	}
	
	
	public static String getDoctorUserName(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Doctor_username FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String dusername = rs.getString("Doctor_username"); 
	    st.close();
	    con.close();
	    return (dusername);
	}
	
	
	

	
	
	///////////////////////////////// Setter Functions ////////////////////////////////////
	
	
	public static void setDate(String user_name, int date) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Date = \"" + date + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	
	public static void setHours(String user_name, int hours) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Hours = \"" + hours + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setMinutes(String user_name, int mins) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Minutes = \"" + mins + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setDoctorUserName(String user_name, String duser) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Doctor_username = \"" + duser + "\"  WHERE patient_username = \"" + user_name + "\"";
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
	
	public static void InsertAppointment(String date, int hours, int minutes, String pname, String dname) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO OfficeAutomation.Patient VALUES(?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		
		st.setString(1, date);
		st.setInt(2, hours);
		st.setInt(3, minutes);
		st.setString(4, pname);
		st.setString(5, dname);
		
		st.executeUpdate();
		
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
	}
}
