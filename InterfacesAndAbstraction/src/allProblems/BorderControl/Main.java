package allProblems.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> allKindOFCitizen = new ArrayList<>();
        
        String input;
        while (!(input = scan.nextLine()).equals("End")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 2) {
                Robot robot = new Robot(tokens[0],tokens[1]);
                allKindOFCitizen.add(robot);
            } else {
                Citizen citizen = new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
                allKindOFCitizen.add(citizen);
            }
        }

        String fakeId = scan.nextLine();
        for (Identifiable citizen : allKindOFCitizen) {
            String id = citizen.getId();
           if (id.contains(fakeId)) {
              String substring = id.substring(id.length() - fakeId.length());
              if (substring.equals(fakeId)) {
                  System.out.println(id);
              }
           }

        }
    }
}
