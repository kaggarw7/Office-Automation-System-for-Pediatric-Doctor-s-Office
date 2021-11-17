import java.time.LocalDate;
import java.util.ArrayList;

public class Nurse extends Person {
    private ArrayList<Doctor> assignedDoctors;

    // Constructor

    public Nurse(String firstName, String lastName, LocalDate birthday, String address, String phoneNumber, String username, String password) {
        super(firstName, lastName, birthday, address, phoneNumber, username, password);
    }

    // Getters

    public ArrayList<Doctor> getAssignedDoctors() {
        return assignedDoctors;
    }

    // Functionality

    public void addAssignedDoctor(Doctor doctor) {
        assignedDoctors.add(doctor);
    }

    public void removeAssignedDoctor(Doctor doctor) {
        if (assignedDoctors.contains(doctor)) {
            assignedDoctors.remove(doctor);
        } else {
            System.out.println("This Doctor is not assigned to this Nurse.");
        }
    }
}