package TheChicken;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String chickenName = scan.nextLine();
        int chickenAge = Integer.parseInt(scan.nextLine());

        try {
            Chicken chicken = new Chicken(chickenName,chickenAge);
            System.out.println(chicken);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
