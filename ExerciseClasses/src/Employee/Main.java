package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String , Department> departmentMap = new HashMap<>();

        int n = Integer.parseInt(bf.readLine());
        while (n-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");
            String name = tokens[0];
            double salary =Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee = null;
            if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(name,salary,position,department,email,age);
            } else if (tokens.length == 4) {
                employee = new Employee(name,salary,position,department);
            } else if (tokens.length == 5) {
                if (tokens[4].length() <= 3) {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name,salary,position,department,age);
                } else {
                    String email = tokens[4];
                    employee = new Employee(name,salary,position,department,email);
                }
            }
            departmentMap.putIfAbsent(department, new Department());
            departmentMap.get(department).getList().add(employee);
        }

        String bestDepartment = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparing(d -> d.getValue().getAverageSalary()))
                .get()
                .getKey();

        System.out.printf("Highest Average Salary: %s%n", bestDepartment);

        departmentMap.get(bestDepartment).getList()
                .stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(),e1.getSalary()))
                .forEach(employee -> {
                    System.out.printf("%s %.2f %s %d%n",employee.getName()
                    ,employee.getSalary(),employee.getEmail(),employee.getAge());
                });

    }

}

