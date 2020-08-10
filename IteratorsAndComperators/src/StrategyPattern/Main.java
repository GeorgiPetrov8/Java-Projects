package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> names = new TreeSet<>(new NameComparator());
        Set<Person> age = new TreeSet<>(new  AgeComparator());

        int n = Integer.parseInt(bf.readLine());
        while (n-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            names.add(person);
            age.add(person);
        }

        names.forEach(e -> System.out.println(e.getName() + " " + e.getAge()));
        age.forEach(e -> System.out.println(e.getName() + " " + e.getAge()));
    }
}
