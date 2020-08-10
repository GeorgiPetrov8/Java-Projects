import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfXp = Double.parseDouble(scan.nextLine());
        int countBattles = Integer.parseInt(scan.nextLine());

        double xpSum = 0.00;
        int count = 0;
        for (int i = 1; i <=countBattles ; i++) {
            int xpReceived = Integer.parseInt(scan.nextLine());
            if (i % 3 ==0) {
                xpSum += (xpReceived + 0.15 * xpReceived);
                count++;
            }else if (i % 5 ==0) {
                xpSum += (xpReceived - 0.10 * xpReceived);
                count++;
            }else {
                xpSum += xpReceived;
                count++;
            }
            if (xpSum >= amountOfXp) {
                System.out.printf("Player successfully collected his needed experience for %d battles.",count);
                break;
            }
        }
        if (xpSum < amountOfXp) {
            double neededXp = amountOfXp - xpSum;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",neededXp);

        }
    }
}
