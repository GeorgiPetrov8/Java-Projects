import java.util.ArrayDeque;
import java.util.Scanner;

public class FirstLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String line = scan.nextLine();

        String currentUrl = "";
        while (!line.equals("Home")) {

            if (line.equals("back")) {

                if (!stack.isEmpty()) {
                    currentUrl = stack.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scan.nextLine();
                    continue;
                }

            } else {

                if (!currentUrl.equals("")) {
                    stack.push(currentUrl);
                }
                currentUrl = line;
            }

            System.out.println(currentUrl);
            line = scan.nextLine();

        }
    }
}
// Da q pregovorq !!!
