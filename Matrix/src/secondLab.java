import java.util.Arrays;
import java.util.Scanner;

public class secondLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = readArray(scan);

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = readMatrix(rows, cols, scan);

        int numberToCheck = Integer.parseInt(scan.nextLine());

        String output = " ";

        for (int row = 0; row < matrix.length ; row++) {
            int colsNum = matrix[row].length;
            for (int col = 0; col < colsNum  ; col++) {
                int currentNumber = matrix[row][col];

                if (currentNumber == numberToCheck) {
                    System.out.println(row + " " + col);

                    output += "yes";
                }
            }
        }

        if (output.equals(" ")) {
            System.out.println("not found");
        }


    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows ; row++) {
            int[] line = readArray(scan);
            for (int col = 0; col < line.length ; col++) {
                matrix[row][col] = line[col];
            }
        }
        return matrix;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
