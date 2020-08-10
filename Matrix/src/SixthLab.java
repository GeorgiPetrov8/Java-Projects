import java.util.Arrays;
import java.util.Scanner;

public class SixthLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < line.length; col++) {
                matrix[row][col] = line[col];
            }
        }

        for (int rNc = 0; rNc < matrix.length; rNc++) {
            System.out.print(matrix[rNc][rNc] + " ");
        }
        System.out.println();
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            System.out.print(matrix[row][col] + " ");
            col++;

        }
    }
}
