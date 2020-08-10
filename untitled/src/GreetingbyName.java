import java.util.Scanner;

public class GreetingbyName {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String Nakov= scanner.nextLine();
        System.out.printf("Hello, %.s!", Nakov);

    }
}
