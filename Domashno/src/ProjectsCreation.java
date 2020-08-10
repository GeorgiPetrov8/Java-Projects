import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();//ime
        int a = Integer.parseInt(scan.nextLine());//broi proekti 4
        int are = a * 3;// chasove za edin
        System.out.printf("The architect %s will need %d hours to complete %d projects.",name, are,a);
    }
}
