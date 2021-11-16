import java.time.LocalDate;

public class Consultation {
    // Patient Hook
    private String patientUsername;

    // Consultation Record
    private LocalDate date;

    // Vitals
    private double weight;
    private double height;
    private double bloodPressure;

    private String prescribedMedicine;
    private String notes;

    // Constructor

    public Consultation(String patientUsername, LocalDate date, double weight, double height, double bloodPressure, String prescribedMedicine, String notes) {
        this.patientUsername = patientUsername;

        this.date = date;

        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;

        this.prescribedMedicine = prescribedMedicine;
        this.notes = notes;
    }

    // Getters


    public String getPatientUsername() {
        return patientUsername;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public String getNotes() {
        return notes;
    }
}
