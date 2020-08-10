import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        
        String[][] matrix = new String[rows][cols];
        generateMatrix(matrix,rows,cols);
        printMatrix(matrix);

    }
    private static void generateMatrix(String[][] matrix, int rows, int cols) {
        char firstAndLastWord = 97;
        for (int row = 0; row < rows ; row++) {

            for (int col = 0; col < cols ; col++ ) {
                String currentText = "";
                currentText += firstAndLastWord;

                if (row + col == 0) {
                    currentText += firstAndLastWord;
                } else {
                    int middle = 97 + row + col;
                    currentText += (char)middle;
                }
                currentText += firstAndLastWord;

                matrix[row][col] = currentText;
            }
            firstAndLastWord++;
        }
    }
    private static void printMatrix(String[][] matrix) {
        for (String[] row: matrix) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
