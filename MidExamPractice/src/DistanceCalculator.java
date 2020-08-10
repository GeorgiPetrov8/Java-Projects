import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stepsMade = Integer.parseInt(scan.nextLine());
        double lengthOfOneStep = Double.parseDouble(scan.nextLine());
        int distanceNeeded = Integer.parseInt(scan.nextLine());//in metres

        double stepsCount = 0.0;
        for (int i = 1; i <= stepsMade; i++) {
            if (i % 5==0) {
                stepsCount += lengthOfOneStep - (lengthOfOneStep * 0.30) ;
            }else {
                stepsCount += lengthOfOneStep;
            }
        }
        double distanceInCentimeters = distanceNeeded * 100;
        double result = stepsCount / distanceInCentimeters * 100;
        System.out.printf("You travelled %.2f%% of the distance!" ,result);
    }

}
