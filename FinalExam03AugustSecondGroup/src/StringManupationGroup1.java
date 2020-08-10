import java.util.Scanner;

public class StringManupationGroup1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Translate":
                    String charToFind = tokens[1];
                    String replacement = tokens[2];
                    input = input.replaceAll(charToFind, replacement);
                    System.out.println(input);
                    break;
                case "Includes":
                    String string = tokens[1];
                    if (input.contains(string)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String str = tokens[1];
                    if (input.contains(str)) {
                        String strToCompare = input.substring(0, str.length());
                        if (strToCompare.equals(str)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    break;
                case "Lowercase":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    char charIndex = tokens[1].charAt(0);
                    int indexToPrint = input.lastIndexOf(charIndex);
                    System.out.println(indexToPrint);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);
                    StringBuilder result = new StringBuilder(input);
                    result.replace(startIndex, startIndex + count, "");
                    System.out.println(result);
                    break;

            }

            command = scan.nextLine();
        }

    }
}