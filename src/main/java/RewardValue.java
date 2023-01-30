public class RewardValue {
    private double cashValue;
    private double conversionRate;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.conversionRate = 10.0; // Default conversion rate (10 miles per dollar)
    }

    public RewardValue(double cashValue, double conversionRate) {
        this.cashValue = cashValue;
        this.conversionRate = conversionRate;
    }

    public double getMilesValue() {
        return cashValue * conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }
}
