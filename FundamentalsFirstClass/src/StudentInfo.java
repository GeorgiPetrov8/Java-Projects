import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double averageGrade = Double.parseDouble(scan.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);


    }
}
