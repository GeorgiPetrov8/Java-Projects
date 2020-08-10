package OpinonPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Persons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> olderPerson = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);


            olderPerson.add(person);


        }
        olderPerson
                .stream()
                .filter(p -> p.getAge() > 30)
                .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList())
                .forEach(p -> System.out.println(p.toString()));

    }
}
