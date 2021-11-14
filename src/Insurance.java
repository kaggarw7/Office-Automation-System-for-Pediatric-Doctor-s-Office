public class Insurance {
    private String insuranceName;
    private int policyID;
    private int groupNumber;

    // Constructor

    public Insurance(String insuranceName, int policyID, int groupNumber) {
        this.insuranceName = insuranceName;
        this.policyID = policyID;
        this.groupNumber = groupNumber;
    }

    // Getters

    public String getInsuranceName() {
        return insuranceName;
    }

    public int getPolicyID() {
        return policyID;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    // Setters

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public void setPolicyID(int policyID) {
        this.policyID = policyID;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
