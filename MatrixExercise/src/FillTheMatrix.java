import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        char type = input[1].charAt(0);

        int[][] matrix = new int[n][n];

        if (type == 'A') {
            readByFirstOption(matrix);
        } else if (type == 'B') {
            readBySecondOption(matrix);
        }

        printTheMatrix(matrix);
    }

    private static void readByFirstOption(int[][] matrix) {
        int numberCount = 1;
        for (int col = 0; col < matrix[0].length ; col++) {

                for (int row = 0; row < matrix.length ; row++) {
                    matrix[row][col] = numberCount++;
                }
        }
    }

    private static void readBySecondOption(int[][] matrix) {
        int numberCount = 1;

        for (int col = 0; col < matrix[0].length ; col++) {

            if (col % 2 == 0) {

                for (int row = 0; row < matrix.length ; row++) {
                    matrix[row][col] = numberCount++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0 ; row--) {
                    matrix[row][col] = numberCount++;
                }
            }
        }
    }

    private static void printTheMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
}
