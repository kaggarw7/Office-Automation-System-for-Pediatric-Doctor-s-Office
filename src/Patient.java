
public class Patient {

	private Doctor assignedDoctor;
	private Nurse assignedNurse;
	private Consultation[] consultationRecord ;
	private Appointment nextAppointment;
	private Insurance insurance;
	private Prescription prescription;
	private Pharmacy preferredPharmacy;
	

	// Getters
	public Doctor getDoctor()
	{
		return this.assignedDoctor;
	}

    public Consultation[] getRecord()
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
	
	public void setInsurance(String insuranceCompany, string claimsAddress)
	{
		this.insurance.insuranceCompany =  insuranceCompany;
		this.insurance.claimAddress = claimsAddress;
	}
	
	public void setPrescription(String Medicine, int timespermonth, int dosageAmount)
	{
		this.prescription.medicine = Medicine;
		this.prescription.timespermonth = timespermonth;
		this.prescription.dosageAmount = dosageAmount;
	}
	
	public void setPharmacy(String pharmacyCompany, String pharmacyAddress, String city, String state, int zipcode , long phoneNumber, String emailAddress)
	{
		Pharmacy pharmacy = new Pharmacy(pharmacyCompany,pharmacyAddress,city,state,zipcode,phoneNumber,emailAddress);
	}

	// Functionality

	public void newConsultation()
	{
		Consultation consultation = new Consultation();

	}

}
