package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentList;

    public StudentSystem() {
        this.studentList = new HashMap<>();
    }

    public void ParseCommand(String[] tokens) {
        String command = tokens[0];

        if (command.equals("Create")) {
            String name = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double grade = Double.parseDouble(tokens[3]);

            Student student = new Student(name, age, grade);
            studentList.put(name, student);
        } else if (command.equals("Show")) {
            String name = tokens[1];
            if (studentList.containsKey(name)) {
                Student student = studentList.get(name);
                String view = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    view += " Excellent student.";
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    view += " Average student.";
                } else {
                    view += " Very nice person.";
                }

                System.out.println(view);
            }
        }
    }
}

