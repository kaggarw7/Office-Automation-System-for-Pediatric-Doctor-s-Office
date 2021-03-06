import java.sql.*;


public class AppointmentDatabase {
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
	static String uname = "admin";
	static String pass = "CSETeam12";
	
	
	///////////////////////////////// Getter Functions  ////////////////////////////////////
	
	public static int getYear(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Year FROM OfficeAutomation.Appointment where PatientUserName = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int year = rs.getInt("Year");
	    st.close();
	    con.close();
	    return (year);
	}
	
	public static int getMonth(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Month FROM OfficeAutomation.Appointment where PatientUserName = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int month = rs.getInt("Month");
	    st.close();
	    con.close();
	    return (month);
	}
	
	
	public static int getDay(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Day FROM OfficeAutomation.Appointment where PatientUserName = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int day = rs.getInt("Day");
	    st.close();
	    con.close();
	    return (day);
	}
	
	
	
	
	public static int getHour(String user_name) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT Hour FROM OfficeAutomation.Appointment where PatientUserName = \"" + user_name + "\"";
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
		String query = "SELECT Minute FROM OfficeAutomation.Appointment where PatientUserName = \"" + user_name + "\"";
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
		String query = "SELECT DoctorUserName FROM OfficeAutomation.Appointment where PatientUserName = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String dusername = rs.getString("DoctorUserName"); 
	    st.close();
	    con.close();
	    return (dusername);
	}
		
	
	///////////////////////////////////// Setter Functions /////////////////////////////////////////
	
	
	
	public static void setYear(String user_name, int year) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Appointment SET Year = \"" + year + "\"  WHERE PatientUserName = \"" + user_name + "\"";
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
        String query = "UPDATE OfficeAutomation.Appointment SET Month = \"" + month + "\"  WHERE PatientUserName = \"" + user_name + "\"";
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
        String query = "UPDATE OfficeAutomation.Appointment SET Day = \"" + day + "\"  WHERE PatientUserName = \"" + user_name + "\"";
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
        String query = "UPDATE OfficeAutomation.Appointment SET Hour = \"" + hour + "\"  WHERE PatientUserName = \"" + user_name + "\"";
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
        String query = "UPDATE OfficeAutomation.Appointment SET Minute = \"" + min + "\"  WHERE PatientUserName = \"" + user_name + "\"";
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
        String query = "UPDATE OfficeAutomation.Appointment SET DoctorUserName = \"" + duser + "\"  WHERE PatientUserName = \"" + user_name + "\"";
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
		String query = "INSERT INTO OfficeAutomation.Appointment VALUES(?,?,?,?,?,?,?)";
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
