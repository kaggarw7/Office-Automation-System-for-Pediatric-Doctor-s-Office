public class Pharmacy {
    private String pharmacyCompany;

    private String address;
    private String city;
    private String state;
    private int zipCode;

    private long phoneNumber;
    private String emailAddress;

    // Constructor

    public Pharmacy(String pharmacyCompany, String address, String city, String state, int zipCode, long phoneNumber, String emailAddress) {
        this.pharmacyCompany = pharmacyCompany;

        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Getters

    public String getPharmacyCompany() {
        return pharmacyCompany;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Setters


    public void setPharmacyCompany(String pharmacyCompany) {
        this.pharmacyCompany = pharmacyCompany;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
