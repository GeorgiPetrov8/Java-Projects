import java.util.Scanner;

public class CounerStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scan.nextLine());
        int wonBattleCount = 0;

        String command = scan.nextLine();
        while (!command.equals("End of battle")) {
            int distanceNeed = Integer.parseInt(command);

            if (distanceNeed > initialEnergy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n"
                        , wonBattleCount, initialEnergy);
                return;
            } else {
                initialEnergy = initialEnergy - distanceNeed;
                wonBattleCount++;
                if (wonBattleCount % 3 ==0) {
                    initialEnergy += wonBattleCount;
                }

            }
            command = scan.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattleCount, initialEnergy);

    }
}
