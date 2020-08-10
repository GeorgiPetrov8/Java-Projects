import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Integer.parseInt(scan.nextLine());
        String[] days = new String[]{"M","Tu","W","Th","F","Sa","Su"};
        if (day > 0 && day<= 7) {
            day = day - 1;
            System.out.println(days[day]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
