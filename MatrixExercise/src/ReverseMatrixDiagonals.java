import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];
        readMatrix(matrix, scan);

        for (int row = matrix.length - 1; row >= 0 ; row--) {
            for (int col = matrix[row].length - 1; col >= 0; col--) {
                if (matrix[row][col] != 0) {
                    System.out.print(matrix[row][col] + " ");

                }
                int currentRow = row - 1;
                for (int i = col + 1; i <= matrix[row].length - 1; i++) {
                    if (currentRow >= 0 && i <= matrix[row].length - 1) {
                        if (matrix[currentRow][i] != 0) {
                            System.out.print(matrix[currentRow][i] + " ");
                            matrix[currentRow][i] = 0;
                            currentRow--;
                        }
                    }

                }
                if (matrix[row][col] != 0) {
                    System.out.println();
                    matrix[row][col] = 0;
                }

            }

        }
    }

    private static void readMatrix(int[][] matrix, Scanner scan) {
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = line[col];
            }

        }
    }
}
