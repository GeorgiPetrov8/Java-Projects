import java.util.Scanner;

public class ThirdLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scan);
        char[][] secondMatrix = readMatrix(rows, cols, scan);

        printMatrixResult(firstMatrix, secondMatrix, rows, cols);
        System.out.println();
    }


    private static char[][] readMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] line = scan.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                char currentChar = line[col].charAt(0);
                matrix[row][col] = currentChar;
            }

        }


        return matrix;
    }


    private static void printMatrixResult(char[][] firstMatrix, char[][] secondMatrix, int rows, int cols) {
        char[][] resultMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    resultMatrix[row][col] = firstMatrix[row][col];
                } else {
                    resultMatrix[row][col] = '*';
                }
            }
        }


        for (char[] matrix : resultMatrix) {
            for (char c : matrix) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
