package ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] split = Arrays.stream(scan.nextLine().split("\\s+"))
                .skip(1).toArray(String[]::new);

        ListyIterator listyIterator = new ListyIterator(split);

        String input = scan.nextLine();
        while (!input.equals("END")) {
            switch (input) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }
            input = scan.nextLine();
        }
    }
}
