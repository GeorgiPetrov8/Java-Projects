import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> invitedPeople = new ArrayList<>();

        Set<String> vipPeople = new TreeSet<>();
        Set<String> regularPeople = new TreeSet<>();

        String people = "";
        while (!(people = scan.nextLine()).equals("PARTY")) {
            invitedPeople.add(people);
        }

        String camePeople = "";
        while (!(camePeople = scan.nextLine()).equals("END")) {
            invitedPeople.remove(camePeople);
        }

        for (String person : invitedPeople) {
            if (Character.isDigit(person.charAt(0))) {
                vipPeople.add(person);
            } else {
                regularPeople.add(person);
            }
        }

        System.out.println(vipPeople.size() + regularPeople.size());
        for (String vipPerson : vipPeople) {
            System.out.println(vipPerson);
        }
        for (String regularPerson : regularPeople) {
            System.out.println(regularPerson);
        }

    }
}
