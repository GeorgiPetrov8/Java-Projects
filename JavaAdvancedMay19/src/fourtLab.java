import java.util.ArrayDeque;
import java.util.Scanner;

public class fourtLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String line = scan.nextLine();

        for (int i = 0; i < line.length() ; i++) {
            char currentChar = line.charAt(i);


            if (currentChar == '(') {
                stack.push(i);
            } else if (currentChar == ')') {
                int startIndex = stack.pop();
                String contents = line.substring(startIndex, i + 1);
                System.out.println(contents);

            }
        }

    }
}
