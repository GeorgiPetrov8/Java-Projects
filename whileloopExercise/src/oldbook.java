import java.util.Scanner;

public class oldbook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favbook = scan.nextLine();
        int capacity = Integer.parseInt(scan.nextLine());
        int count = 0;

        String currentbook = " ";
        boolean isfound = false;
        while (!isfound && capacity > count) {
            currentbook = scan.nextLine();
            if (currentbook.equals(favbook)) {
                isfound = true;
            } else {
                count++;
            }
            if (isfound) {
                System.out.printf("You checked %d books and Found it.", count);
            } else {
                System.out.printf("The book you search is not here!%nYou checked %d books.", count);
            }

        }


    }
}
