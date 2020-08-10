package CustomArrayAndStack;

import java.util.Random;
import java.util.Scanner;

public class CustomDataStructures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SmartArrayDeque sm = new SmartArrayDeque();

        for (int i = 0; i < 10; i++) {
            sm.push(i);
        }
        System.out.println(sm.peek());

    }
}
