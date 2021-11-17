public class Prescription {
    private String medicine;
    private String dosageAmount;
    private int timesPerMonth;

    // Constructor

    public Prescription(String medicine, String dosageAmount, int timesPerMonth) {
        this.medicine = medicine;
        this.dosageAmount = dosageAmount;
        this.timesPerMonth = timesPerMonth;
    }

    // Getters

    public String getMedicine() {
        return medicine;
    }

    public String getDosageAmount() {
        return dosageAmount;
    }

    public int getTimesPerMonth() {
        return timesPerMonth;
    }

}
