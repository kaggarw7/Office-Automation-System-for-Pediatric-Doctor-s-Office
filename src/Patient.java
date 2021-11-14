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

    public Patient(Doctor assignedDoctor, Nurse assignedNurse, Insurance insurance) {

    }

	// Getters

    // Setters

	// Functionality

	public void newConsultation(Consultation consultation)
	{
		consultationRecord.add(consultation);

	}
}
