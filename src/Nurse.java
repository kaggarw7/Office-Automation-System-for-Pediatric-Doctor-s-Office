import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Nurse extends Person {
    private Doctor assignedDoctor;

    // Constructor

    public Nurse(String firstName, String lastName, LocalDate birthday, String address, String phoneNumber, String username, String password, Doctor assignedDoctor) {
        super(firstName, lastName, birthday, address, phoneNumber, username, password);

        this.assignedDoctor = assignedDoctor;
    }

    public Nurse(String username) throws ClassNotFoundException, SQLException {
        super(NurseDatabase.getNurseFirstName(username), NurseDatabase.getNurseLastName(username), LocalDate.of(NurseDatabase.getNurseBirthYear(username), NurseDatabase.getNurseBirthMonth(username), NurseDatabase.getNurseBirthDay(username)), NurseDatabase.getNurseAddress(username), NurseDatabase.getNursePhoneNumber(username), username, null);

        this.assignedDoctor = new Doctor(NurseDatabase.getNurseDoctorUsername(username));
    }

    // Getters

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    // Setters

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }
}