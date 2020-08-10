package footballTeamGenerator;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Team> teamList = new HashMap<>();

        String input;
        while (!(input = scan.nextLine()).equals("END")) {
            String[] tokens = input.split(";");
            String teamName = tokens[1];

            switch (tokens[0]) {
                case "Team":
                    try {
                        Team team = new Team(teamName);
                        teamList.put(teamName, team);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Add":
                    if (teamList.containsKey(teamName)) {
                        try {
                            String playerName = tokens[2];
                            int endurance = Integer.parseInt(tokens[3]);
                            int sprint = Integer.parseInt(tokens[4]);
                            int dribble = Integer.parseInt(tokens[5]);
                            int passing = Integer.parseInt(tokens[6]);
                            int shooting = Integer.parseInt(tokens[7]);
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teamList.get(teamName).addPlayer(player);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }
                    break;
                case "Remove":
                    if (teamList.containsKey(teamName)) {
                        try {
                            teamList.get(teamName).removePlayer(tokens[2]);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }
                    break;
                case "Rating":
                    if (teamList.containsKey(teamName)) {
                        System.out.printf("%s - %.0f%n", teamList.get(teamName).getName(),
                                teamList.get(teamName).getRating());
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }
                    break;
            }
        }

    }

}
