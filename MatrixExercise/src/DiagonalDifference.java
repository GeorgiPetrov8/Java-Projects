import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];
        readMatrix(matrix, scan);

        int sumFirst = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumFirst += matrix[i][i];
        }

        int sumSecond = 0;
        int col = 0;
        for (int i = matrix.length - 1; i >= 0 ; i--) {
            sumSecond += matrix[i][col++];
        }

        System.out.println(Math.abs(sumFirst - sumSecond));

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
