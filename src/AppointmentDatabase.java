import java.sql.*;


public class AppointmentDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
	static String uname = "admin";
	static String pass = "CSETeam12";
	
	
	///////////////////////////////// Getter Functions  ////////////////////////////////////
	
	public static String getYear(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Year FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String year = rs.getString("Year"); 
	    st.close();
	    con.close();
	    return (year);
	}
	
	public static String getMonth(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Month FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String month = rs.getString("Month"); 
	    st.close();
	    con.close();
	    return (month);
	}
	
	
	public static String getDay(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Day FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
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
	
	
	
	
	public static int getHour(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Hour FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int hour = Integer.parseInt(rs.getString("Hour")); 
	    st.close();
	    con.close();
	    return (hour);
	}
	
	
	public static int getMinute(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Minute FROM OfficeAutomation.Appointment where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int min = Integer.parseInt(rs.getString("Minute")); 
	    st.close();
	    con.close();
	    return (min);
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
		
	
	///////////////////////////////////// Setter Functions /////////////////////////////////////////
	
	
	
	public static void setYear(String user_name, int year) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Year = \"" + year + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setMonth(String user_name, int month) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Month = \"" + month + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setDay(String user_name, int day) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Day = \"" + day + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	
	public static void setHour(String user_name, int hour) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Hour = \"" + hour + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setMinute(String user_name, int min) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Minute = \"" + min + "\"  WHERE patient_username = \"" + user_name + "\"";
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
	
	public static void InsertAppointment(int year, int month, int day, int hour, int minute, String patientUsername, String doctorUsername) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO OfficeAutomation.Patient VALUES(?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		
		st.setInt(1, year);
		st.setInt(2, month);
		st.setInt(3, day);
		st.setInt(4, hour);
		st.setInt(5, minute);
		st.setString(6, patientUsername);
		st.setString(7, doctorUsername);
		st.executeUpdate();
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
	}
}
