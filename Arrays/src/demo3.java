import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int sum = 0;

        for (int i = 0; i <input.length ; i++) {
            numbers[i]=Integer.parseInt(input[i]);
            if (numbers[i] % 2 ==0) {
                sum+= numbers[i];
            }


        }
        System.out.println(sum);
    }
}
