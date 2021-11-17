import java.time.LocalDate;

public class Appointment {
    private LocalDate date;
    private int hour;
    private int minute;

    private String patientUsername;
    private String doctorUsername;

    // Constructor

    public Appointment(LocalDate date, int hour, int minute, String patientUsername, String doctorUsername) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;

        this.patientUsername = patientUsername;
        this.doctorUsername = doctorUsername;
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

    public String getPatientUsername() {
        return patientUsername;
    }

    public String getDoctorUsername() {
        return doctorUsername;
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

    // Functionality

    @Override
    public String toString() {
        return this.date.toString() + " at " + this.hour + ":" + this.minute;
    }
}
