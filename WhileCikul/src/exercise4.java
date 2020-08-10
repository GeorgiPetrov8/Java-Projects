import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int broivnoski =Integer.parseInt(scan.nextLine());
        double vnoska = 0;

        while (vnoska < broivnoski){
            vnoska++;
        double kolichestvo = Double.parseDouble(scan.nextLine());
        if (kolichestvo < 0) {
            System.out.println("Invalid operation!");
            break;
        }

            System.out.printf("Increase : %.2f%n", kolichestvo);

        }
    }
}
