import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String skill = scan.nextLine();

        String input = scan.nextLine();
        while (!input.equals("For Azeroth")) {
            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "GladiatorStance":
                    skill = skill.toUpperCase();
                    System.out.println(skill);
                    break;
                case "DefensiveStance":
                    skill = skill.toLowerCase();
                    System.out.println(skill);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(tokens[1]);
                    String letter = tokens[2];
                    if (index >= 0 && index < skill.length()) {
                        StringBuilder sb = new StringBuilder(skill);
                        sb.replace(index,index + 1, letter);
                        skill = sb.toString();
                        System.out.println("Success!");
                    } else {
                        System.out.println("Dispel too weak.");
                    }
                    break;
                case "Target":
                    if (tokens[1].equals("Change")) {
                        String substring = tokens[2];
                        String secondSubstring = tokens[3];
                        if (skill.contains(substring)) {
                            skill = skill.replace(substring, secondSubstring);
                            System.out.println(skill);
                        }
                    } else if (tokens[1].equals("Remove")) {
                        String substringToRemove = tokens[2];
                        if (skill.contains(substringToRemove)) {
                            skill = skill.replace(substringToRemove, "");
                            System.out.println(skill);
                        }
                    } else {
                        System.out.println("Command doesn't exist!");
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
                    break;
            }
            input = scan.nextLine();
        }
    }
}
