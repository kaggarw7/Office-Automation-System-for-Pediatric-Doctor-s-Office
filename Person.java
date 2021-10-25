import java.util.*;
public class Person {
	
	private String firstName;
	private String lastName;
	private int id;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private String address;
	private long phoneNumber;
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getBirthDay()
	{
		return this.birthDay;
	}
	
	public int getBirthMonth()
	{
		return this.birthMonth;
	}
	
	public int getBirthYear()
	{
		return this.birthYear;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public long getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	void setId (int id)
	{
		this.id = id;
	}
	
	void setBirthDay (int birthDay)
	{
		this.birthDay = birthDay;
	}
	
	void setBirthMonth(int birthMonth)
	{
		this.birthMonth = birthMonth;
	}
	
	void setBirthYear(int birthYear)
	{
		this.birthYear = birthYear;
	}
	
	void setAddress(String address)
	{
		this.address = address;
	}
	
	void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public int getAge()
	{
		Date date = new Date();
		int year = date.getYear();
		return (year - this.birthYear);
	}
}
