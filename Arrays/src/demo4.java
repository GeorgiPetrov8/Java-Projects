import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split(" ");// 1 , 2 , 3 ,4;

        for (int i = 0; i <strings.length / 2 ; i++) {// length = 2
            String temp = strings[i];// zapazva element
            strings[i] = strings[strings.length - 1 - i];// na element 0 slagame elemnt 4;
            strings[strings.length - 1 - i] = temp; // slagame zapazeniqt elemnt na posledno mqsto

        }
        System.out.println(String.join(" ", strings));

    }
}
