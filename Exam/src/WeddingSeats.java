import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine()); // 50
        double width = Double.parseDouble(scan.nextLine());// 25
        double sideOfTheBar = Double.parseDouble(scan.nextLine());//2

        double SizeOfTheHall =length * width ; //50 * 25
        double SizeOfTheBar = sideOfTheBar * sideOfTheBar; // 2 * 2
        double SizeOFTheDancing = SizeOfTheHall * 0.19; //1250 * 0.19
        double FreeSpace = SizeOfTheHall - SizeOfTheBar - SizeOFTheDancing; //1008.5
        int NumberOfPeople =(int)Math.ceil(FreeSpace / 3.2);
        System.out.println((NumberOfPeople));
    }
}
