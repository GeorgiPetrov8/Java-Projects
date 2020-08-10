import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<Double> > allStudents = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            String studentName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            allStudents.putIfAbsent(studentName,new ArrayList<>());
            allStudents.get(studentName).add(grade);

        }
        allStudents
                .entrySet()
                .stream().map()
    }
}
