package StudentsProblem;

import OpinonPoll.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Student> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student person = new Student(firstName, lastName, grade);
            people.add(person);
        }
        people.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : people) {
            System.out.println(student.toString());

        }
    }

}