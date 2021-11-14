import java.time.LocalDate;

public class Appointment {
    private LocalDate date;
    private int hour;
    private int minute;

    private Patient patient;
    private Doctor doctor;

    // Constructor

    public Appointment(LocalDate date, int hour, int minute, Patient patient, Doctor doctor) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;

        this.patient = patient;
        this.doctor = doctor;
    }

    // Getters

    public LocalDate getDate() {
        return date;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    // Setters

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
