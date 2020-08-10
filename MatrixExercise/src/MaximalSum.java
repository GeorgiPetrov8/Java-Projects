import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];
        readMatrix(matrix, scan);

        int bestSum = Integer.MIN_VALUE;
        int indexRow = 0;
        int indexCol = 0;

        for (int r = 1; r < matrix.length - 1; r++) {
            for (int c = 1; c < matrix[r].length - 1; c++) {

                int currentSum = sum(matrix, r, c);

                if (currentSum > bestSum) {
                    bestSum = currentSum;
                    indexRow = r;
                    indexCol = c;
                }
            }
        }
        System.out.println("Sum = " + bestSum);
        printMatrix(matrix, indexRow, indexCol);

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

    private static int sum(int[][] matrix, int r, int c) {
        int currentCenter = matrix[r][c];
        int leftUpDiagonal = matrix[r - 1][c - 1];
        int rightUpDiagonal = matrix[r - 1][c + 1];
        int leftDownDiagonal = matrix[r + 1][c - 1];
        int rightDownDiagonal = matrix[r + 1][c + 1];
        int upVertical = matrix[r - 1][c];
        int downVertical = matrix[r + 1][c];
        int leftHorizontal = matrix[r][c - 1];
        int rightHorizontal = matrix[r][c + 1];

        int sum;
        sum = currentCenter + leftUpDiagonal + rightUpDiagonal +
                leftDownDiagonal + rightDownDiagonal + upVertical + downVertical +
                leftHorizontal + rightHorizontal;

        return sum;

    }

    private static void printMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int r = indexRow - 1; r <= indexRow + 1; r++) {
            for (int c = indexCol - 1; c <= indexCol + 1; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
