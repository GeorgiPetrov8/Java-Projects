package OrderByAgeProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Persons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name,id,age);
            people.add(person);

            input = scan.nextLine();
        }
        people
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(person -> System.out.println(person.toString()));
    }
}
