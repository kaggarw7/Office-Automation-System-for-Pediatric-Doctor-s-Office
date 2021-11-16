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

    public Patient(String firstName, String lastName, LocalDate birthday, String address, long phoneNumber, String username, String password, Doctor assignedDoctor, String insuranceID, String pharmacyAddress) {
        super(firstName, lastName, birthday, address, phoneNumber, username, password);

        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedDoctor.getAssignedNurse();
        this.insuranceID = insuranceID;
        this.pharmacyAddress = pharmacyAddress;
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

    public Appointment getNextAppointment() {
        return nextAppointment;
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
