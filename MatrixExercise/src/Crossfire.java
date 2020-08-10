import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = readMatrix(rows, cols);


        String line;
        while (!(line = scan.nextLine()).equals("Nuke it from orbit")) {
            String[] tokens = line.split("\\s+");

            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            if (matrix[row][col] == 0 ) {
                col++;
            }


            for (int r = row; r <= row + radius; r++) {

                if (r < matrix.length) {
                    matrix[r][col] = 0;
                }
            }

            for (int r = row; r >= row - radius; r--) {
                if (r >= 0) {
                    matrix[r][col] = 0;
                }
            }


            for (int c = col; c <= col + radius; c++) {
                if (c < matrix[row].length) {
                    matrix[row][c] = 0;
                }
            }

            for (int c = col; c >= col - radius; c--) {
                if (c >= 0) {
                    matrix[row][c] = 0;
                }
            }


        }

        for (int[] r : matrix) {
            for (int c : r) {
                if (c == 0) {
                    System.out.print("");
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }

    }


    private static int[][] readMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int numberToPut = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = numberToPut++;

            }
        }

        return matrix;
    }
}
//Fail!