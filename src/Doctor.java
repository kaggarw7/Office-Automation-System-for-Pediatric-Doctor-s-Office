import java.util.*;
public class Doctor {
	
	private Nurse assignedNurse;
	private Patient assignedPatient[];
	
	public Nurse getAssignedNurse()
	{
		return this.assignedNurse;
	}
	
	public Patient getPatient(int index)
	{
		return this.assignedPatient[index];
	}
}
