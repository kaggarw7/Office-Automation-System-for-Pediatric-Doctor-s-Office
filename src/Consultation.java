import java.time.LocalDate;

public class Consultation {
    // Consultation Record
    private int id;
    private LocalDate date;

    // Vitals
    private double weight;
    private double height;
    private double bloodPressure;

    private Prescription prescribedMedicine;
    private String notes;

    // Constructor

    public Consultation(int id, LocalDate date, double weight, double height, double bloodPressure, Prescription prescribedMedicine, String notes) {
        this.id = id;
        this.date = date;

        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;

        this.prescribedMedicine = prescribedMedicine;
        this.notes = notes;
    }

    // Getters

    public int getId() {
        return id;
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

    public Prescription getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public String getNotes() {
        return notes;
    }
}
