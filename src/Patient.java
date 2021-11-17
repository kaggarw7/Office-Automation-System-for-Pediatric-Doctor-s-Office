import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Patient extends Person {

	private Doctor assignedDoctor;
	private Nurse assignedNurse;
	private String insuranceID;
	private String pharmacyAddress;

    private ArrayList<Prescription> prescriptions;
    private ArrayList<Consultation> consultationRecord ;
    private Appointment nextAppointment;

	// Constructor

    public Patient(String firstName, String lastName, LocalDate birthday, String address, String phoneNumber, String username, String password, Doctor assignedDoctor, String insuranceID, String pharmacyAddress) {
        super(firstName, lastName, birthday, address, phoneNumber, username, password);

        this.assignedDoctor = assignedDoctor;
        if (assignedDoctor != null) {
            this.assignedNurse = assignedDoctor.getAssignedNurse();
        } else {
            this.assignedNurse = null;
        }

        this.insuranceID = insuranceID;
        this.pharmacyAddress = pharmacyAddress;
    }

    public Patient(String username) throws ClassNotFoundException, SQLException {
        super(PatientDatabase.getPatientFirstName(username), PatientDatabase.getPatientLastName(username), LocalDate.of(PatientDatabase.getPatientBirthDay(username), PatientDatabase.getPatientBirthMonth(username), PatientDatabase.getPatientBirthYear(username)), PatientDatabase.getPatientAddress(username), PatientDatabase.getPatientPhoneNumber(username), username, null);


        //this.assignedDoctor = new Doctor(PatientDatabase.getPatientDoctorUsername(username));
        if (!PatientDatabase.getPatientDoctorUsername(username).equals("_")) {
            this.assignedDoctor = new Doctor(PatientDatabase.getPatientDoctorUsername(username));
        }
        if (assignedDoctor.getAssignedNurse() != null) {
            this.assignedNurse = assignedDoctor.getAssignedNurse();
        } else {
            this.assignedNurse = null;
        }

        //this.insuranceID = PatientDatabase.getPatientInsuranceID(username);
        //this.pharmacyAddress = PatientDatabase.getPatientPharmacyAddress(username);
    }

	// Getters

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public Nurse getAssignedNurse() {
        return assignedNurse;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public ArrayList<Consultation> getConsultationRecord() {
        return consultationRecord;
    }

    public Consultation getLastConsultation() {
        return consultationRecord.get(consultationRecord.size() - 1);
    }

    public Appointment getNextAppointment() throws ClassNotFoundException, SQLException {
        LocalDate appointmentDate = LocalDate.of(AppointmentDatabase.getYear(this.getUsername()), AppointmentDatabase.getMonth(this.getUsername()), AppointmentDatabase.getDay(this.getUsername()));
        return new Appointment(appointmentDate, AppointmentDatabase.getHour(this.getUsername()), AppointmentDatabase.getMinute(this.getUsername()), this.getUsername(), AppointmentDatabase.getDoctorUserName(this.getUsername()));
    }

    // Setters

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public void setAssignedNurse(Nurse assignedNurse) {
        this.assignedNurse = assignedNurse;
    }

    public void setNextAppointment(Appointment nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public void setPharmacyAddress(String pharmacyAddress) {
        this.pharmacyAddress = pharmacyAddress;
    }

    // Functionality

	public void newConsultation(Consultation consultation) {
		consultationRecord.add(consultation);
	}

	public void newPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public void removePrescription(Prescription prescription) {
        prescriptions.remove(prescription);
    }
}
