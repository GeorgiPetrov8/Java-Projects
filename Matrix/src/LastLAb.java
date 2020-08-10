import java.util.Arrays;
import java.util.Scanner;

public class LastLAb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        int[][] matrix = readMatrix(rows,scan);

        int[] input = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];

        int wrongNumber = matrix[row][col];

        for (int r = 0; r < rows ; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                int number = matrix[r][c];

                if (number == wrongNumber) {

                    int sum = 0;

                    if (c + 1 <= matrix[r].length - 1 && matrix[r][c + 1] != wrongNumber) {
                        sum += matrix[r][c + 1];

                    }

                    if (c - 1 >= 0 && matrix[r][c - 1] != wrongNumber) {
                        sum += matrix[r][c - 1];
                    }

                    if (r - 1 >= 0 && matrix[r - 1][c] != wrongNumber) {
                        sum += matrix[r - 1][c];
                    }

                    if (r + 1 <= matrix.length - 1 && matrix[r + 1][c] != wrongNumber) {
                        sum += matrix[r + 1][c];
                    }

                    matrix[r][c] = sum;

                }
            }
        }

        for (int[] r : matrix) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    private static int[][] readMatrix(int rows, Scanner scan) {
        int[] cols = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int[][] matrix = new int[rows][cols.length];
        for (int c = 0; c < cols.length; c++) {
            matrix[0][c] = cols[c];
        }

        for (int row = 1; row < rows ; row++) {
            int[] line = Arrays.stream(scan.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < line.length ; i++) {
                matrix[row][i] = line[i];
            }
        }

        return matrix;
    }
}
