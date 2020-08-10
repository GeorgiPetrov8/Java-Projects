import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople= Integer.parseInt(scan.nextLine());//17
        int capacity = Integer.parseInt(scan.nextLine());//3
        double courses =Math.ceil((numberOfPeople * 1.00) / capacity);//17.00 / 5 = 3.40
        System.out.printf("%.0f",courses);

    }
}
