import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scan.nextLine());//recorda koito trqbva da podobri
        double distanceInMetres = Double.parseDouble(scan.nextLine());//razstoqnieto koeto trqbva da prepluva
        double TimeInSecondsForOneMeter= Double.parseDouble(scan.nextLine());//vreme v secundi za koito pluva za 1 metur
        double TimeInSecondsForAll = TimeInSecondsForOneMeter * distanceInMetres;
        double secondsBonus =

        if (TimeInSecondsForAll < recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.",TimeInSecondsForAll);

        } else  {
            System.out.printf("Yes, he succeeded! The new record is %.2f seconds.",TimeInSecondsForAll);
        }


    }
}
