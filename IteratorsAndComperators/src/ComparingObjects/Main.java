package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            Person person = new Person(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
            people.add(person);

            input = scan.nextLine();
        }

        int index = Integer.parseInt(scan.nextLine()) - 1;
        Person person = people.get(index);
       int equalPeople = 0;
       int notEqual = 0;
       int totalPpl = 0;

        for (Person p : people) {
            if (p.compareTo(person) == 0) {
                equalPeople++;
            } else {
                notEqual++;
            }
            totalPpl++;
        }

        if (equalPeople - 1 == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d",equalPeople,notEqual,totalPpl);
        }
    }
}
