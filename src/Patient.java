import java.util.ArrayList;

public class Patient {

	private Doctor assignedDoctor;
	private Nurse assignedNurse;
	private ArrayList<Consultation> consultationRecord ;
	private Appointment nextAppointment;
	private Insurance insurance;
	private Prescription prescription;
	private Pharmacy preferredPharmacy;
	

	// Getters
	public Doctor getDoctor()
	{
		return this.assignedDoctor;
	}

    public ArrayList<Consultation> getRecord()
    {
        return this.consultationRecord;
    }

    public Insurance getInsurance()
    {
        return this.insurance;
    }

    public Prescription getPrescription()
    {
        return this.prescription;
    }

    public Pharmacy getPharmacy()
    {
        return this.prefferedPharmacy;
    }

	public void setDoctor(Doctor doctor)
	{
		this.assignedDoctor = doctor;
	}
	
	public void setInsurance(Insurance insurance)
	{
		this.insurance = insurance;
	}
	
	public void setPrescription(Prescription prescription)
	{
		this.prescription = prescription;
	}
	
	public void setPharmacy(Pharmacy pharmacy)
	{
		preferredPharmacy = pharmacy;
	}

	// Functionality

	public void newConsultation(Consultation consultation)
	{
		consultationRecord.add(consultation);

	}
}
