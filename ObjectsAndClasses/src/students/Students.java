package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student(firstName, lastName, age, city);

            students.add(student);
            input = scan.nextLine();
        }

        String cityInput = scan.nextLine();
        for (int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            if (currentStudent.getCity().equals(cityInput)) {
                System.out.printf("%s %s is %d years old.%n",
                        currentStudent.getFirstName(),
                        currentStudent.getLastName(),
                        currentStudent.getAge());


            }


        }
    }
}