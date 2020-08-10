import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queueForward = new ArrayDeque<>();

        String inputUrl = scan.nextLine();
        String currentUrl = "";
        while (!inputUrl.equals("Home")) {

            if (inputUrl.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                    inputUrl = scan.nextLine();
                    continue;
                } else {
                    queueForward.addFirst(currentUrl);
                    currentUrl = stack.pop();
                }
            }

            else if (inputUrl.equals("forward")) {
                if (queueForward.isEmpty()) {
                    System.out.println("no next URLs");
                    inputUrl = scan.nextLine();
                    continue;
                } else {
                    currentUrl = queueForward.poll();
                }
            }

            else {
                if (!currentUrl.isEmpty()) {
                    stack.push(currentUrl);
                }
                currentUrl = inputUrl;
                queueForward.clear();
            }
            System.out.println(currentUrl);
            inputUrl = scan.nextLine();
        }
    }
}
