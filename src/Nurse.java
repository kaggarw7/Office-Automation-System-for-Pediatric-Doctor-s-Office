import java.util;

public class Nurse{

    private Doctor assignedDoctor;
    private Patient assignedPatient[];

    public Doctor getAssignedDoctor(){
        return this.assignedDoctor;
    }

    public Patient getAssignedDoctor(int index){
        return this.assignedPatient[index];
    }
}