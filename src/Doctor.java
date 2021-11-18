import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends Person {
	private Nurse assignedNurse;
	private ArrayList<Patient> assignedPatients;

	// Constructor

    public Doctor(String firstName, String lastName, LocalDate birthday, String address, String phoneNumber, String username, String password, Nurse assignedNurse) {
        super(firstName, lastName, birthday, address, phoneNumber, username, password);

        this.assignedNurse = assignedNurse;
    }

    public Doctor(String username) throws ClassNotFoundException, SQLException {
        super(DoctorDatabase.getDoctorFirstName(username), DoctorDatabase.getDoctorLastName(username), LocalDate.of(DoctorDatabase.getDoctorBirthYear(username), DoctorDatabase.getDoctorBirthMonth(username), DoctorDatabase.getDoctorBirthDay(username)), DoctorDatabase.getDoctorAddress(username), DoctorDatabase.getDoctorPhoneNumber(username), username, null);

        this.assignedNurse = new Nurse(DoctorDatabase.getDoctorNurseUsername(username));
    }

    // Getters

    public Nurse getAssignedNurse() {
        return assignedNurse;
    }

    public ArrayList<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    // Setters

    public void setAssignedNurse(Nurse assignedNurse) {
        this.assignedNurse = assignedNurse;
    }

    // Functionality

    public void addNewPatient(Patient patient) {
        assignedPatients.add(patient);
    }
}
