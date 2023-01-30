import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void convert_from_cash_to_miles() {
        RewardValue rewardValue = new RewardValue(10.0); // $10 cash value
        double expectedMiles = 100.0; // 10 miles per dollar
        double actualMiles = rewardValue.getMilesValue();
        assertEquals(expectedMiles, actualMiles, 0.01); // Delta for double comparison
    }

    @Test
    public void create_with_cash_value() {
        double cashValue = 10000.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.01); // Delta for double comparison
    }

    @Test
    public void create_with_miles_value() {
        double milesValue = 100000.0;
        double conversionRate = 10.0; // 10 miles per dollar
        double expectedCashValue = milesValue / conversionRate;
        RewardValue rewardValue = new RewardValue(expectedCashValue, conversionRate);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.01); // Delta for double comparison
    }

    @Test
    public void convert_from_miles_to_cash() {
        double milesValue = 5000.0;
        double conversionRate = 20.0; // 20 miles per dollar
        double expectedCashValue = milesValue / conversionRate;
        RewardValue rewardValue = new RewardValue(expectedCashValue, conversionRate);
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.01); // Delta for double comparison
    }
}
