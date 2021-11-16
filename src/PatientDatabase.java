import java.sql.*;


public class PatientDatabase {
	static String url = "jdbc:mysql://localhost:3306/office_automation";
	static String uname = "root";
	static String pass = "Chinu@1998";
	
	
	
	
	///////////////////////////////////////// GETTERS FOR PATIENT TABLE /////////////////////////////////////////////////////
	
	public static void getPatientFirstName(String user_name) throws Exception
	{
		String query = "SELECT First_name FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String fname = rs.getString("First_name");
	    System.out.println(fname);
	    st.close();
	    con.close();
	}
	
	
	public static void getPatientLastName(String user_name) throws Exception
	{
		String query = "SELECT Last_name FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String lname = rs.getString("Last_name");
	    System.out.println(lname);
	    st.close();
	    con.close();
	}
	
	
	public static void getPatientBirthDay(String user_name) throws Exception
	{
		String query = "SELECT Birth_day FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String bday = rs.getString("Birth_day");
	    System.out.println(bday);
	    st.close();
	    con.close();
	}
	
	
	
	public static void getPatientBirthMonth(String user_name) throws Exception
	{
		String query = "SELECT Birth_month FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String bmonth = rs.getString("Birth_month");
	    System.out.println(bmonth);
	    st.close();
	    con.close();
	}
	
	
	public static void getPatientBirthYear(String user_name) throws Exception
	{
		String query = "SELECT Birth_Year FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String byear = rs.getString("Birth_Year");
	    System.out.println(byear);
	    st.close();
	    con.close();
	}
	
	
	public static void getPatientAddress(String user_name) throws Exception
	{
		String query = "SELECT Address FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String address = rs.getString("Address");
	    System.out.println(address);
	    st.close();
	    con.close();
	}
	
	
	public static long getPatientPhoneNumber(String user_name) throws Exception
	{
		String query = "SELECT Phone_number FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    long phoneNumber = rs.getLong("Phone_number");
	    System.out.println(phoneNumber);
	    st.close();
	    con.close();
	    return phoneNumber;
	}
	
	
	
	public static void getPatientDoctorUsername(String user_name) throws Exception
	{
		String query = "SELECT Doctor_username FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String doctor_username = rs.getString("Doctor_username");
	    System.out.println(doctor_username);
	    st.close();
	    con.close();
	}
	
	
	
	public static void getPatientNurseUsername(String user_name) throws Exception
	{
		String query = "SELECT Nurse_username FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String nusername = rs.getString("Nurse_username");
	    System.out.println(nusername);
	    st.close();
	    con.close();
	}
	
	
	public static void getPatientUsername(String user_name) throws Exception
	{
		String query = "SELECT patient_username FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String fname = rs.getString("patient_username");
	    System.out.println(fname);
	    st.close();
	    con.close();
	}
	
	
	public static void getPatientPassword(String user_name) throws Exception
	{
		String query = "SELECT patient_password FROM Patient where patient_username = \"" + user_name + "\"";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();  
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	    String ppassword = rs.getString("patient_password");
	    System.out.println(ppassword);
	    st.close();
	    con.close();
	}
	
	
	
	
	/////////////////////////// SETTERS FOR PATIENT TABLE /////////////////////////////
	
	
	
	
	public static void setPatientFirstName(String user_name, String first_name) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE PATIENT SET First_name = \"" +first_name + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Last_name = \"" + last_name + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Birth_day = \"" + birth_day + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Birth_month = \"" + birth_month + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Birth_Year = \"" + birth_year + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Address = \"" + address + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	public static void setPatientPhoneNumber(String user_name, long phoneNumber) throws ClassNotFoundException, SQLException
    {
        String query = "UPDATE PATIENT SET Phone_number = \"" + phoneNumber + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Doctor_username = \"" + dusername + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET Nurse_username = \"" + nusername + "\"  WHERE patient_username = \"" + user_name + "\"";
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
        String query = "UPDATE PATIENT SET patient_password = \"" + password + "\"  WHERE patient_username = \"" + user_name + "\"";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(url, uname, pass);
                Statement st = con.createStatement();) {

             st.executeUpdate(query);
             System.out.println("Database updated successfully ");
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	public static void main(String args[]) throws Exception
	{
		Database.setPatientPassword("kartikaggarwal", "No password");
	}
	*/
}
