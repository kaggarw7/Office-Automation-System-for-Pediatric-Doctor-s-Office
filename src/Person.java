import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String firstName;
	private String lastName;

	private LocalDate birthday;

	private String address;
	private String phoneNumber;

	private String username;
	private String password;

	// Constructor

    public Person() {
        firstName = null;
        lastName = null;

        birthday = null;

        address = null;
        phoneNumber = null;

        username = null;
        password = null;
    }

    public Person(String firstName, String lastName, LocalDate birthday, String address, String phoneNumber, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.birthday = birthday;

        this.address = address;
        this.phoneNumber = phoneNumber;

        this.username = username;
        this.password = password;
    }

    // Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();

        Period birthToToday = Period.between(this.birthday, today);
        return birthToToday.getYears();
    }

    // Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Functionality

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
