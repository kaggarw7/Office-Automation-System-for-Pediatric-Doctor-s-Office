public class Prescription {
    private String medicine;
    private int timesPerMonth;
    private int dosageAmount;

    // Constructor

    public Prescription(String medicine, int timesPerMonth, int dosageAmount) {
        this.medicine = medicine;
        this.timesPerMonth = timesPerMonth;
        this.dosageAmount = dosageAmount;
    }

    // Getters

    public String getMedicine() {
        return medicine;
    }

    public int getTimesPerMonth() {
        return timesPerMonth;
    }

    public int getDosageAmount() {
        return dosageAmount;
    }
}
