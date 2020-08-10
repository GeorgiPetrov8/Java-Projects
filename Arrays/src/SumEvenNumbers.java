import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int even = 0;
        for (int i = 0; i <input.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            if (numbers[i] % 2 ==0){
                even+=numbers[i];
            }

        }
        System.out.println(even);
    }
}
