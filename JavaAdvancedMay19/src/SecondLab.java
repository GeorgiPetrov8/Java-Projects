import java.util.ArrayDeque;
        import java.util.Collections;
        import java.util.Scanner;

public class SecondLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split("\\s+");

        ArrayDeque<String> stackNumbers = new ArrayDeque<>();
        Collections.addAll(stackNumbers, tokens);

        while (stackNumbers.size() > 1) {
            int firstNumber = Integer.parseInt(stackNumbers.pop());
            String op = stackNumbers.pop();
            int secondNumber = Integer.parseInt(stackNumbers.pop());

            switch (op) {
                case "+":
                    stackNumbers.push(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    stackNumbers.push(String.valueOf(firstNumber - secondNumber));
                    break;

            }

        }
        System.out.println(stackNumbers.pop());

    }
}
