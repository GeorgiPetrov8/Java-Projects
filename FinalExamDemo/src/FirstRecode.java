import java.util.Scanner;

public class FirstRecode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder currentMessage = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            char currentChar = input.charAt(i);
            currentMessage.append(currentChar);
        }

        String command = scan.nextLine();
        while (!command.equals("Finish")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Replace":
                    char currentChar = tokens[1].charAt(0);
                    char newChar = tokens[2].charAt(0);
                    for (int i = 0; i < currentMessage.length() ; i++) {
                        char currentIndex = currentMessage.charAt(i);
                        if (currentIndex == currentChar) {
                            currentMessage.replace(i,i+1, String.valueOf(newChar));
                        }
                    }
                    System.out.println(currentMessage);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex < 0 || endIndex >= currentMessage.length()) {
                        System.out.println("Invalid indexes!");
                    } else {
                        currentMessage.replace(startIndex, endIndex, "");
                        System.out.println(currentMessage);
                    }
                    break;
                case "Make":
                    String caseType = tokens[1];
                    if (caseType.equals("Upper")) {
                        for (int i = 0; i < currentMessage.length() ; i++) {
                            if (!Character.isLowerCase(currentMessage.charAt(i))) {
                                Character.toUpperCase(currentMessage.charAt(i));
                            }

                        }
                    } else {
                        System.out.println(currentMessage.toString().toLowerCase());
                        currentMessage.toString().toLowerCase();
                    }
                    break;
                case "Check":
                    String stringToCheck = tokens[1];
                    if (!currentMessage.toString().contains(stringToCheck)) {
                        System.out.printf("Message doesn't contains %s%n",stringToCheck);
                    } else {
                        System.out.printf("Message contains %s%n",stringToCheck);
                    }
                    break;
                case "Sum":
                    int startIdx = Integer.parseInt(tokens[1]);
                    int endIdx = Integer.parseInt(tokens[2]);
                    int sum = 0;
                   if (startIdx < 0 || endIdx >= currentMessage.length()) {
                       System.out.println("Invalid indexes!");
                   } else {
                       for (int i = startIdx; i <= endIdx ; i++) {
                           int currentSim = currentMessage.charAt(i);
                           sum += currentSim;

                       }
                       System.out.println(sum);
                   }

                    break;
            }
            command = scan.nextLine();
        }
    }
}
