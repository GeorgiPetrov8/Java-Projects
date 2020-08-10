import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> matrix = new ArrayList<>();

        String[] input = scan.nextLine().split("\\(|\\)");
        int n = Integer.parseInt(input[1]);

        int rotateType = n % 360 / 90;

        int count = 0;

        String line = "";
        while (!(line = scan.nextLine()).equals("END")) {
            if (line.length() > count) {
                count = line.length();
            }
            matrix.add(line);
        }

        if (rotateType == 1) {
            for (int i = 0; i < count ; i++) {
                for (int j = matrix.size() - 1; j >= 0 ; j--) {

                    try {
                        char currentWord = matrix.get(j).charAt(i);
                    } catch (Exception e) {
                        System.out.print(' ');
                        continue;
                    }

                    System.out.print(matrix.get(j).charAt(i));
                }
                System.out.println();
            }

        } else if (rotateType == 2) {
            for (int i = matrix.size() - 1; i >= 0 ; i--) {
                StringBuilder reverseLetter = new StringBuilder();
                reverseLetter.append(matrix.get(i));
                System.out.println(reverseLetter.reverse());
            }
        } else if (rotateType == 3) {
            for (int i = count - 1; i >= 0 ; i--) {
                for (int j = 0; j <= matrix.size() - 1 ; j++) {

                    try {
                        char currentChar = matrix.get(j).charAt(i);
                    } catch (Exception e) {
                        System.out.print(' ');
                        continue;
                    }

                    System.out.print(matrix.get(j).charAt(i));
                }
                System.out.println();
            }

        } else {
            for (String letter : matrix) {
                System.out.println(letter);
            }
        }

    }
}
