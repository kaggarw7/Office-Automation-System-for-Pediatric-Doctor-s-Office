import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String firstName;
	private String lastName;

	private int id;

	private LocalDate birthday;

	// Constructor

    public Person() {
        firstName = null;
        lastName = null;

        id = -1;

        birthday = null;
    }

    public Person(String firstName, String lastName, int id, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.id = id;

        this.birthday = birthday;
    }

    // Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthday() {
        return birthday;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
