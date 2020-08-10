import java.util.Scanner;

public class ArcheryTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("|");
        int[] numbers = new int[input.length];

        String command;
        while (!"Game over".equals(command = scan.nextLine())) {
            String[] tokens = command.split("\\s+");

            String firstElement = tokens[0];
            switch (firstElement) {
                case "Shoot":
                    int startIndex = Integer.parseInt(tokens[1]);//0
                    int length = Integer.parseInt(tokens[1]);//6
                    if (tokens[1].equals("Left@"+startIndex+"@"+length)) {

                    }

                    break;
                case "Shoot Right":
                    break;
                case "Reverse":
                    break;
            }

        }


    }
}
