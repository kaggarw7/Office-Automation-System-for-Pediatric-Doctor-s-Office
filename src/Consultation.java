import java.time.LocalDate;

public class Consultation {
    // Patient Hook
    private String patientUsername;

    // Consultation Record
    private LocalDate date;

    // Vitals
    private double weight;
    private double height;
    private String bloodPressure;

    private Prescription prescription;
    private String notes;

    // Constructor

    public Consultation(String patientUsername, LocalDate date, double weight, double height, String bloodPressure, Prescription prescription, String notes) {
        this.patientUsername = patientUsername;

        this.date = date;

        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;

        this.prescription = prescription;
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

    public String getBloodPressure() {
        return bloodPressure;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public String getNotes() {
        return notes;
    }
}
