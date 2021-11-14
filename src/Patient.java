import java.time.LocalDate;
import java.util.ArrayList;

public class Patient extends Person {

	private Doctor assignedDoctor;
	private Nurse assignedNurse;
	private ArrayList<Consultation> consultationRecord ;
	private Appointment nextAppointment;
	private Insurance insurance;
	private Prescription prescription;
	private Pharmacy preferredPharmacy;

	// Constructor

    public Patient(String firstName, String lastName, LocalDate birthday, Doctor assignedDoctor, Insurance insurance) {
        super(firstName, lastName, birthday);

        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedDoctor.getAssignedNurse();
        this.insurance = insurance;
    }

	// Getters

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public Nurse getAssignedNurse() {
        return assignedNurse;
    }

    public ArrayList<Consultation> getConsultationRecord() {
        return consultationRecord;
    }

    public Appointment getNextAppointment() {
        return nextAppointment;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public Pharmacy getPreferredPharmacy() {
        return preferredPharmacy;
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

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public void setPreferredPharmacy(Pharmacy preferredPharmacy) {
        this.preferredPharmacy = preferredPharmacy;
    }

    // Functionality

	public void newConsultation(Consultation consultation)
	{
		consultationRecord.add(consultation);

	}
}
