import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = Integer.parseInt(scan.nextLine());

        if (day > 0 && day <= 7) {
            day = day - 1;
            System.out.println(days[day]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}//0 1 2 3 4 5 6
//m t w t f s s
//
