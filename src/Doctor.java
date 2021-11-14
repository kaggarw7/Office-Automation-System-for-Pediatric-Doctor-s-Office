import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends Person {
	private Nurse assignedNurse;
	private ArrayList<Patient> assignedPatients;

	// Constructor

    public Doctor(String firstName, String lastName, LocalDate birthday, Nurse assignedNurse) {
        super(firstName, lastName, birthday);

        this.assignedNurse = assignedNurse;
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
