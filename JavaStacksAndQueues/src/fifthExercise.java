import java.util.Scanner;

public class fifthExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] robots = scan.nextLine().split("\\;");

        for (int i = 0; i < robots.length ; i++) {
            String currentRobot = robots[i];
            String robotName = currentRobot.substring(0, '-');
            int processTime = Integer.parseInt(currentRobot.replaceAll("-",""));

            System.out.println(robotName);
            System.out.println(processTime);

        }

    }
}
