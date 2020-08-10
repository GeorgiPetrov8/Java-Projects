import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];// 2 , 10 , 3

        for (int i = 0; i <input.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);// 2 , 10 , 3;

        }              // 3 , 2 , (1 break;)
        while (numbers.length > 1) { // 3 > 1;
            int[] temp = new int[numbers.length - 1];//3-1= 2; ( 0 , 0)
            for (int i = 0; i < temp.length ; i++) {// i = 0 , i < 2 , i++;
                temp[i] = numbers[i] + numbers[i + 1];//0 = 2 + 10
            }
            numbers = temp;//
        }
        System.out.println(numbers[0]);


    }
}