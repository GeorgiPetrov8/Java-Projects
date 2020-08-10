import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];// 1 , 2  , 3 , 4;

        for (int i = 0; i < input.length; i++) {//4
            numbers[i] = Integer.parseInt(input[i]);
        }

        while (numbers.length > 1) {// 4 > 1; 3 > 1; 2>1
            int[] temp = new int[numbers.length - 1];// 0 , 0 , 0 : 3 , 5 ,7
            for (int i = 0; i < temp.length; i++) { // 3
                temp[i] = numbers[i] + numbers[i + 1];// 3 , 5 , 7
            }
            numbers = temp; // numbers[3]= 3 , 5 ,7 ; 8 , 12 ; 20
        }
        System.out.println(numbers[0]);
    }

    }



