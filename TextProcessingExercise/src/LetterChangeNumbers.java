import java.util.Scanner;

public class LetterChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");//A123b
        String[] numbers = new String[input.length];
        double sum = 0;
        char firstOperation = '/';
        char secondOperation = '+';
        for (String element : input) {
            if (Character.isLowerCase(element.charAt(0))) {
                firstOperation = '*';
            }
            if (Character.isUpperCase(element.charAt(element.length() - 1))) {
                secondOperation = '-';
            }
            StringBuilder number = new StringBuilder();
            for (int i = 1; i < element.length()- 1 ; i++) {
                char currentChar = element.charAt(i);
                number.append(currentChar);
            }
            double firstResult = Integer.parseInt(number.toString()) + firstOperation ;
            double secondResult = Integer.parseInt(number.toString()) + secondOperation;
            sum += firstResult + secondResult;


        }

    }
}
