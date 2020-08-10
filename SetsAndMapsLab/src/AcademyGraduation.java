import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Float>> studentsGrades = new TreeMap<>();

        while (n-- > 0) {
            String name = scan.nextLine();
            studentsGrades.putIfAbsent(name, new ArrayList<>());

            String[] grades = scan.nextLine().split("\\s+");

            for (int i = 0; i < grades.length ; i++) {
                float grade = Float.parseFloat(grades[i]);
                studentsGrades.get(name).add(grade);
            }
        }

        studentsGrades.entrySet().forEach(e -> {
            System.out.print(String.format("%s is graduated with ", e.getKey()));
            float sum = (float) e.getValue().stream().mapToDouble(v->v).sum();
            float average = sum / e.getValue().size();
            System.out.println(average);
        });

    }
}
