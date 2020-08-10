import java.util.Arrays;
import java.util.Scanner;

public class fifthLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] input = readArray(scan);
        int rows = input[0];
        int cols = input[1];

        int[][] theMatrix = readMatrix(rows,cols,scan);

        int bestSum = Integer.MIN_VALUE;
        int resultRow = 0;
        int resultCol = 0;
        for (int row = 0; row < theMatrix.length - 1 ; row++) {
            for (int col = 0; col < theMatrix[row].length - 1 ; col++) {

                int currentSum = theMatrix[row][col] + theMatrix[row][col + 1] +
                        theMatrix[row + 1][col] + theMatrix[row + 1][col + 1];
                if (currentSum > bestSum) {
                    bestSum = currentSum;
                    resultRow = row;
                    resultCol = col;
                }

            }

        }
        System.out.print(theMatrix[resultRow][resultCol] + " ");
        System.out.println(theMatrix[resultRow][resultCol + 1]);
        System.out.print(theMatrix[resultRow + 1][resultCol] + " ");
        System.out.println(theMatrix[resultRow + 1][resultCol + 1]);
        System.out.println(bestSum);


    }
    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt).toArray();
    }
    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows ; row++) {
            int[] colsToAdd = readArray(scan);
            for (int col = 0; col <colsToAdd.length ; col++) {
                int currentNum = colsToAdd[col];
                matrix[row][col] = currentNum;
            }
        }
        return matrix;
    }
}
