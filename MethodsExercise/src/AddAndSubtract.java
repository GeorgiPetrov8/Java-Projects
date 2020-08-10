import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        sumFistAndSecond(a,b);
        System.out.println(subtract(sumFistAndSecond(a, b), c));
    }
    private static int sumFistAndSecond (int a , int b) {
        int sum = a + b;
        return sum;
    }

    private static int subtract (int sum , int c ){
        int result = sum - c;
        return result;
    }
}
