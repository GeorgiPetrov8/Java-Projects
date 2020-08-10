import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstArrays = scan.nextLine().split(" ");
        int[] firstNumbers = new int[firstArrays.length];

        String[] secondArrays = scan.nextLine().split(" ");
        int[] secondNumbers = new int[secondArrays.length];

        int sumFirstArr = 0;
        int identical = 0;

        for (int i = 0; i <firstArrays.length ; i++) {
            firstNumbers[i]=Integer.parseInt(firstArrays[i]);
            sumFirstArr += firstNumbers[i];

        }
        for (int i = 0; i <secondArrays.length ; i++) {
            secondNumbers[i]=Integer.parseInt(secondArrays[i]);
            if (firstNumbers[i] != secondNumbers[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
            if (secondNumbers[i] == firstNumbers[i]) {
                identical += secondNumbers[i];

            }
        }
        if (identical==sumFirstArr) {
            System.out.printf("Arrays are identical. Sum: %d", identical);

        }



    }
}
