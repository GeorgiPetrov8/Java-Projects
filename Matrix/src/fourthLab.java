import java.util.Arrays;
import java.util.Scanner;

public class fourthLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int [] input = readArray(scan);
       int rows = input[0];
       int cols = input[1];

       int[][] theMatrix = readMatrix(rows,cols,scan);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumAllElements(theMatrix));
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

    private static int sumAllElements(int[][] theMatrix) {
        int sum = 0;

        for (int[] row : theMatrix) {
            for (int num : row) {
                sum += num;
            }
        }

        return sum;
    }
}
