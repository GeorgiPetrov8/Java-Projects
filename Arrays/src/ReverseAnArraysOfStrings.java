import java.util.Scanner;

public class ReverseAnArraysOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split(" ");
        for (int i = 0; i <strings.length / 2 ; i++) {
            String temp = strings[i];
            strings[i]=strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;

        }

        System.out.println(String.join(" ",strings));

    }
}
