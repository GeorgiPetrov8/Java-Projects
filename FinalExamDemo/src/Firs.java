import java.util.Scanner;

public class Firs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        StringBuilder replacedText = new StringBuilder();


        String command = scan.nextLine();
        while (!command.equals("Finish")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Replace":
                    String currentChar = tokens[1];
                    String newChar = tokens[2];
                    for (int i = 0; i < text.length() ; i++) {
                        char currentIndex = text.charAt(i);
                        if (currentIndex == currentChar.charAt(0)) {
                            replacedText.append(newChar.charAt(0));
                        } else {
                            replacedText.append(currentIndex);
                        }
                    }
                    System.out.println(replacedText);
                    break;
                case "Cut":
                    StringBuilder cutText = new StringBuilder();
                    cutText.append(replacedText);
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex < 0 || endIndex >= replacedText.length()) {
                        System.out.println("Invalid indexes!");
                    } else {
                        cutText.replace(startIndex,endIndex,"");
                        System.out.println(cutText);
                    }
                    break;
                case "Make":
                    String caseType = tokens[1];
                    if (caseType.equals("Upper")) {
                        replacedText.toString().toUpperCase();
                        System.out.println(replacedText);
                    } else {
                        replacedText.toString().toLowerCase();
                        System.out.println(replacedText);
                    }
                    break;
                case "Check":
                    String textToCheck = tokens[1];
                    String textToTest = replacedText.toString();
                    if (textToTest.contains(textToCheck)) {
                        System.out.printf("Message contains %s%n",textToCheck);
                    } else {
                        System.out.printf("Message doesn't contains %s%n",textToCheck);
                    }
                    break;
                case "Sum":
                    int startIndex1 = Integer.parseInt(tokens[1]);
                    int endIndex1 = Integer.parseInt(tokens[2]);
                    if (startIndex1 < 0 || endIndex1 >= replacedText.length()) {
                        System.out.println("Invalid indexes!");
                    } else {
                        String charsToSum = replacedText.toString().substring(startIndex1, endIndex1);
                        int sum = 0;
                        for (int i = 0; i <charsToSum.length() ; i++) {
                            int currentNumber = charsToSum.charAt(i);
                            sum += currentNumber;
                        }
                    }
                    break;
            }
            command = scan.nextLine();
        }

    }
}
