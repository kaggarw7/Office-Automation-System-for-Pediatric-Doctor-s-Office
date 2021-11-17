import java.sql.*;


class PatientDatabase
{   
	static String url = "jdbc:mysql://database-1.cazevb7vwbyn.us-east-2.rds.amazonaws.com";
	static String uname = "admin";
	static String pass = "CSETeam12";
	
	
	
	
	///////////////////////////////////////// GETTERS FOR PATIENT TABLE /////////////////////////////////////////////////////
	
	public static String getPatientFirstName(String user_name) throws Exception
	{
		String query = "SELECT First_name FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String fname = rs.getString("First_name");
	    st.close();
	    con.close();
	    return (fname);
	}
	
	
	
	public static String getPatientLastName(String user_name) throws Exception
	{
		String query = "SELECT Last_name FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String lname = rs.getString("Last_name");
	    st.close();
	    con.close();
	    return (lname);
	}
	
	
	public static int getPatientBirthDay(String user_name) throws Exception
	{
		String query = "SELECT Birth_day FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int bday = Integer.parseInt(rs.getString("Birth_day"));
	    st.close();
	    con.close();
	    return (bday) ;
	}
	
	
	
	public static int getPatientBirthMonth(String user_name) throws Exception
	{
		String query = "SELECT Birth_month FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int bmonth = Integer.parseInt(rs.getString("Birth_month"));
	    st.close();
	    con.close();
	    return bmonth;
	}
	
	
	public static int getPatientBirthYear(String user_name) throws Exception
	{
		String query = "SELECT Birth_Year FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    int byear = Integer.parseInt(rs.getString("Birth_Year"));
	    st.close();
	    con.close();
	    return byear;
	}
	
	
	public static String getPatientAddress(String user_name) throws Exception
	{
		String query = "SELECT Address FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
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
	
	
	public static String getPatientPhoneNumber(String user_name) throws Exception
	{
		String query = "SELECT Phone_number FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String pnumber = rs.getString("Phone_number");
	    st.close();
	    con.close();
	    return pnumber;
	}
	
	
	
	public static String getPatientDoctorUsername(String user_name) throws Exception
	{
		String query = "SELECT Doctor_username FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String doctor_username = rs.getString("Doctor_username");
	    st.close();
	    con.close();
	    
	    return doctor_username;
	}
	
	
	
	public static String getPatientNurseUsername(String user_name) throws Exception
	{
		String query = "SELECT Nurse_username FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String nusername = rs.getString("Nurse_username");
	    st.close();
	    con.close();
	    return nusername;
	}
	

	
	public static String getPatientUsername(String user_name) throws Exception
	{
		String query = "SELECT patient_username FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String fname = rs.getString("patient_username");
	    st.close();
	    con.close();
	    
	    return fname;
	}
	
	
	public static String getPatientPassword(String user_name) throws Exception
	{
		String query = "SELECT patient_password FROM OfficeAutomation.Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    
		try
		{
		    ResultSet rs = st.executeQuery(query);
		    rs.next();
		    String ppassword = rs.getString("patient_password");
		    st.close();
		    con.close();
		    return (ppassword);
		}
		catch(Exception e)
		{
			 st.close();
			 con.close();
			 return "_";
		}
	}
	
	
	/////////////////////////// SETTERS FOR PATIENT TABLE /////////////////////////////
	
	
	
	
	public static void setPatientFirstName(String user_name, String first_name) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET First_name = \"" +first_name + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientLastName(String user_name, String last_name) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Last_name = \"" + last_name + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setPatientBirthDay(String user_name, int birth_day) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Birth_day = \"" + birth_day + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientBirthMonth(String user_name, int birth_month) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Birth_month = \"" + birth_month + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientBirthYear(String user_name, int birth_year) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Birth_Year = \"" + birth_year + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientAddress(String user_name, String address) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Address = \"" + address + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientPhoneNumber(String user_name, String pnumber) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Phone_number = \"" + pnumber + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientDoctorUserName(String user_name, String dusername) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Doctor_username = \"" + dusername + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setPatientNurseUserName(String user_name, String nusername) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET Nurse_username = \"" + nusername + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void setPatientPassword(String user_name, String password) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE OfficeAutomation.Patient SET patient_password = \"" + password + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	public static void InsertPatient(String first_name, String last_name, int birth_day, int birth_month, int birth_year, String address, String phone_number,
			String patient_doctor_user_name, String patient_nurse_user_name, String insurance_id, String pharmacy,
			String username, String password) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO OfficeAutomation.Patient VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
		st.setString(8, patient_doctor_user_name);
		st.setString(9, patient_nurse_user_name);
		st.setString(10, insurance_id);
		st.setString(11, pharmacy);
		st.setString(12, username);
		st.setString(13, password);
		
		st.executeUpdate();
		
		System.out.println("Inserted successfully ");
		st.close();
		con.close();
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void main(String args[]) throws Exception
	{
		/*
		Database.InsertPatient("Aryan","Bisht", 11, 10, 2001, "Arizona", 998789978, "kartik", "aditya", "RandomInsurance1234556", "Downtown-tempe-cvs",
				"abis", "helloRocket");
		System.out.println(Database.getPatientPassword(""));
		*/
	}
}
