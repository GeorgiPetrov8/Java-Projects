import java.util.ArrayDeque;
import java.util.Scanner;

public class QueuesFirstLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scan.nextLine();
        while (!input.equals("print")) {
           if (input.equals("cancel")) {
               if (queue.isEmpty()) {
                   System.out.println("Printer is on standby");
               } else {
                   System.out.println(String.format("Canceled %s",queue.poll()));
               }

           } else {
               queue.offer(input);
           }
           input = scan.nextLine();
        }
        for (String file : queue) {
            System.out.println(queue.pollFirst());
        }
    }
}
