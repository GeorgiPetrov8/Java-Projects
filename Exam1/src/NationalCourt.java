import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firsCountPerHour = Integer.parseInt(scan.nextLine());
        int secondCountPerHour = Integer.parseInt(scan.nextLine());
        int thirdCountPerHour = Integer.parseInt(scan.nextLine());

        int totalPeopleCount = Integer.parseInt(scan.nextLine());
        int totalHelpPerHour = firsCountPerHour + secondCountPerHour + thirdCountPerHour;

        int count = 0;
        int totalPeople = totalPeopleCount;
        while (totalPeople > 0) {
            count++;
            if (count % 4==0) {
                continue;
            }
            totalPeople-= totalHelpPerHour;
        }

        System.out.printf("Time needed: %dh.",count);

    }
}
