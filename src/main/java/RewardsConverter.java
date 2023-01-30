import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cash value:");
        double cashValue = scanner.nextDouble();

        System.out.println("Enter conversion rate (miles per dollar):");
        double conversionRate = scanner.nextDouble();

        // Create RewardValue object with cashValue and conversionRate
        RewardValue rewardValue;
        rewardValue = new RewardValue(cashValue, conversionRate);
        double milesValue = rewardValue.getMilesValue();

        System.out.println("$" + cashValue + " is worth " + milesValue + " miles");

        scanner.close();
    }
}
