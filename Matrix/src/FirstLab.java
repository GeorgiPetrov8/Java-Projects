import java.util.Arrays;
import java.util.Scanner;

public class FirstLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = readArray(scan);
        int rows = input[0];
        int cols = input[1];

        int[][] firstMatrix = readMatrix(rows, cols, scan);

        int[] input1 = readArray(scan);
        int rows1 = input1[0];
        int cols1= input1[1];

        int[][] secondMatrix = readMatrix(rows1, cols1, scan);


        if (compareMatrix(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }

    private static boolean compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length ; row++) {

            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }

            for (int col = 0; col < firstMatrix[row].length ; col++) {
                int firstMatrixNumber = firstMatrix[row][col];
                int secondMatrixNumber = secondMatrix[row][col];

                if (firstMatrixNumber != secondMatrixNumber) {
                    return false;
                }
            }
        }

        return true;
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

    private static int[] readArray(Scanner scan) {
       return Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

    }
}
