import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];
        readMatrix(matrix,scan);

        String line = "";
        while (!(line = scan.nextLine()).equals("END")) {
            String[] tokens = line.split("\\s+");

            if (tokens.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }

            int row1 = Integer.parseInt(tokens[1]);
            int col1 = Integer.parseInt(tokens[2]);
            int row2 = Integer.parseInt(tokens[3]);
            int col2 = Integer.parseInt(tokens[4]);


            if (!tokens[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            } else if (row1 < 0 || row1 > matrix.length - 1 &&
                    col1 < 0 || col1 > matrix[0].length - 1) {
                System.out.println("Invalid input!");
                continue;
            } else if (row2 < 0 || row2 > matrix.length - 1 &&
                    col2 < 0 || col2 > matrix[0].length - 1) {
                System.out.println("Invalid input");
                continue;
            }

            String currentText = matrix[row1][col1];

            matrix[row1][col1] = matrix[row2][col2];
            matrix[row2][col2] = currentText;

            for (String[] row : matrix) {
                for (String col : row ) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }

        }
    }

    private static void readMatrix(String[][] matrix, Scanner scan) {
        for (int row = 0; row < matrix.length; row++) {
            String[] line = scan.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = line[col];
            }

        }
    }
}
