import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        TreeMap<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");

            String studentName = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            if (!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
            }
            if (grade >= 2.00 && grade <= 6.00) {
                studentGrades.get(studentName).add(grade);
            }
        }

        studentGrades.forEach((key, value) -> {
            System.out.print(String.format("%s -> ", key));
            value.forEach(v -> System.out.print(String.format("%.2f ",v)));
            double values = value.stream().mapToDouble(v -> v).average().getAsDouble();
            System.out.println(String.format("(avg: %.2f)",values));
        });
    }

}
