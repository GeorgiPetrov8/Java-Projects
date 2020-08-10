import java.util.Scanner;

public class NikuldenProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();


        String command = scan.nextLine();
        while (!command.equals("Finish")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Replace":
                    char currentChar = tokens[1].charAt(0);
                    char newChar = tokens[2].charAt(0);
                    input = input.replace(currentChar, newChar);
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int lengthInput = input.length();
                    if (startIndex >= 0 && endIndex > 0 && endIndex < lengthInput && startIndex < endIndex + 1) {
                        StringBuilder result = new StringBuilder(input);
                        result.replace(startIndex, endIndex + 1, "");
                        System.out.println(result);
                    } else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
                case "Make":
                    String type = tokens[1];
                    if (type.equals("Upper")) {
                        input = input.toUpperCase();
                    } else {
                        input = input.toLowerCase();
                    }
                    System.out.println(input);
                    break;
                case "Check":
                    String string = tokens[1];
                    if (input.contains(string)) {
                        System.out.println(String.format("Message contains %s", string));
                    } else {
                        System.out.println(String.format("Message doesn't contain %s", string));
                    }
                    break;
                case "Sum":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    int inputLength = input.length();
                    if (start >= 0 && end > 0 && end < inputLength && start < end + 1) {
                        String result = input.substring(start, end + 1);
                        int sum = 0;
                        for (int i = 0; i < result.length() ; i++) {
                            char currentSymbol = result.charAt(i);
                            sum += currentSymbol;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
            }
            command = scan.nextLine();
        }

    }
}
//Working 100/100 !!!