import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        String input = scan.nextLine();
        while (!input.equals("Sign up")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Case":
                    String caseType = tokens[1];
                    if (caseType.equals("upper")) {
                        username = username.toUpperCase();
                    } else {
                        username = username.toLowerCase();
                    }
                    System.out.println(username);
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (endIndex > 0 && endIndex < username.length() && startIndex >= 0) {
                        String cutString = username.substring(startIndex, endIndex + 1);
                        StringBuilder result = new StringBuilder();
                        result.append(cutString);
                        System.out.println(result.reverse());
                    }
                    break;
                case "Cut":
                    String substring = tokens[1];
                    if (username.contains(substring)) {
                        username = username.replace(substring,"");
                        System.out.println(username);
                    } else {
                        System.out.println(String.format("The word %s doesn't contain %s.", username, substring));
                    }
                    break;
                case "Replace":
                    char charToReplace = tokens[1].charAt(0);
                    username = username.replace(charToReplace,'*');
                    System.out.println(username);
                    break;
                case "Check":
                    String charToCheck = tokens[1];
                    if (username.contains(charToCheck)) {
                        System.out.println("Valid");
                    } else {
                        System.out.println(String.format("Your username must contain %s.",charToCheck));
                    }
                    break;
            }
            input = scan.nextLine();
        }

    }
}
