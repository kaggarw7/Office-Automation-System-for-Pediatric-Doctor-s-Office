
public class Patient_class {

	private Doctor assignedDoctor;
	private Nurse assignedNurse;
	private Consultation consultationRecord ;
	private Appointment nextAppointment;
	private Insurance insurance;
	private Prescription prescription;
	private Pharmacy prefferedPharmacy;
	
	
		public Doctor getDoctor()
		{
			return assignedDoctor;
		}
	
	public void setDoctor(Doctor doctor)
	{
		this.assignedDoctor = doctor;
	}
	
	
	public Consultation getRecord()
	{
		return this.consultationRecord;
	}
	
	public Insurance getInsurance()
	{
		return this.insurance;
	}
	
	public void setInsurance(String insuranceCompany, string claimsAddress)
	{
		this.insurance.insuranceCompany =  insuranceCompany;
		this.insurance.claimAddress = claimsAddress;
	}
	
	public void newConsultation()
	{
		Consultation consultation = new Consultation();
		
	}
	
	public Prescription getPrescription()
	{
		return this.prescription;
	}
	
	public void setPrescription(String Medicine, int timespermonth, int dosageAmount)
	{
		this.prescription.medicine = Medicine;
		this.prescription.timespermonth = timespermonth;
		this.prescription.dosageAmount = dosageAmount;
	}
	
	public Pharmacy getPharmacy()
	{
		return this.prefferedPharmacy;
	}
	
	public void setPharmacy(String pharmacyCompany, String pharmacyAddress, String city, String state, int zipcode , long phoneNumber, String emailAddress)
	{
		Pharmacy pharmacy = new Pharmacy(pharmacyCompany,pharmacyAddress,city,state,zipcode,phoneNumber,emailAddress);
	}

}
