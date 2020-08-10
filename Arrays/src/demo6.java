import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] input1 = scan.nextLine().split(" ");

        int[] firstArr = new int[input.length];// 1 , 2 , 3;
        int[] secondArr = new int[input1.length];

        int sum = 0;
        int identical = 0;

        for (int i = 0; i <input.length ; i++) {
            firstArr[i]=Integer.parseInt(input[i]);
            sum += firstArr[i];
        }
        for (int i = 0; i <input1.length ; i++) {
            secondArr[i]=Integer.parseInt(input1[i]);

            if (firstArr[i] != secondArr[i]) {
                System.out.println(String.format("difference at %d",i));
                break;
            }
            if (firstArr[i] == secondArr[i]) {
                identical+=secondArr[i];
            }

        }
        if (identical==sum) {
            System.out.printf("Identical Sum is: %d", sum);
        }
    }
}
