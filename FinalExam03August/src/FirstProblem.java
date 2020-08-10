import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String command = scan.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Change":
                    String charToReplace = tokens[1];
                    String replacement = tokens[2];
                    if (input.contains(charToReplace)) {
                        input = input.replaceAll(charToReplace, replacement);
                        System.out.println(input);
                    }
                    break;
                case "Includes":
                    String string = tokens[1];
                    if (input.contains(string)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endString = tokens[1];
                    if (input.contains(endString)) {
                        int startIndex = input.indexOf(endString);
                        int lastIndex = input.length();
                        if (input.substring(startIndex, lastIndex).equals(endString)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String indexToFind = tokens[1];
                    if (input.contains(indexToFind)) {
                        int index = input.indexOf(indexToFind.charAt(0));
                        System.out.println(index);
                    }
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    if (startIndex >= 0 && startIndex < input.length() && length < input.length()) {
                        String output = input.substring(startIndex, startIndex + length );
                        System.out.println(output);
                    }
                    break;
            }
            command = scan.nextLine();
        }

    }
}