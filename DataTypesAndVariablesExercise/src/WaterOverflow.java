import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int littersInTank=0;
        int capacity = 255;
        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scan.nextLine());

            if (littersInTank + litters > capacity) {
                System.out.println("Insufficient capacity!");
            }else {
                littersInTank = littersInTank + litters;
            }

        }
        System.out.println(littersInTank);

    }
}
