package revolt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReVolt {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine());
        int commands = Integer.parseInt(bf.readLine());
        char[][] matrix = new char[size][size];

        int playerRow = 0;
        int playerCol = 0;
        for (int row = 0; row < size; row++) {
            String line = bf.readLine();
            for (int col = 0; col < size; col++) {
                if (line.charAt(col) == 'f') {
                    playerRow = row;
                    playerCol = col;
                }
                matrix[row][col] = line.charAt(col);
            }
        }

        while (commands-- > 0) {
            String input = bf.readLine();
            switch (input) {
                case "up":
                    matrix[playerRow][playerCol] = '-';
                    playerRow--;
                    if (playerRow < 0) {
                        playerRow = matrix.length - 1;
                    }
                    switch (matrix[playerRow][playerCol]) {
                        case 'B':
                            playerRow--;
                            if (playerRow < 0) {
                                playerRow = matrix.length - 1;
                            }
                            break;
                        case 'T':
                            playerRow++;
                            if (playerRow > matrix.length - 1) {
                                playerRow = 0;
                            }
                            break;
                        case 'F':
                            System.out.println("Player won!");
                            matrix[playerRow][playerCol] = 'f';
                            printMatrix(matrix);
                            return;
                    }
                    break;
                case "down":
                    matrix[playerRow][playerCol] = '-';
                    playerRow++;
                    if (playerRow > matrix.length - 1) {
                        playerRow = 0;
                    }
                    switch (matrix[playerRow][playerCol]) {
                        case 'B':
                            playerRow++;
                            if (playerRow > matrix.length - 1) {
                                playerRow = 0;
                            }
                            break;
                        case 'T':
                            playerRow--;
                            if (playerRow < 0) {
                                playerRow = matrix.length - 1;
                            }
                            break;
                        case 'F':
                            System.out.println("Player won!");
                            matrix[playerRow][playerCol] = 'f';
                            printMatrix(matrix);
                            return;
                    }
                    break;
                case "left":
                    matrix[playerRow][playerCol] = '-';
                    playerCol--;
                    if (playerCol < 0) {
                        playerCol = matrix.length - 1;
                    }
                    switch (matrix[playerRow][playerCol]) {
                        case 'B':
                            playerCol--;
                            if (playerCol < 0) {
                                playerCol = matrix.length - 1;
                            }
                            break;
                        case 'T':
                            playerCol++;
                            if (playerCol > matrix.length - 1) {
                                playerCol = 0;
                            }
                            break;
                        case 'F':
                            System.out.println("Player won!");
                            matrix[playerRow][playerCol] = 'f';
                            printMatrix(matrix);
                            return;
                    }
                    break;
                case "right":
                    matrix[playerRow][playerCol] = '-';
                    playerCol++;
                    if (playerCol > matrix.length - 1) {
                        playerCol = 0;
                    }
                    switch (matrix[playerRow][playerCol]) {
                        case 'B':
                            playerCol++;
                            if (playerCol > matrix.length - 1) {
                                playerCol = 0;
                            }
                            break;
                        case 'T':
                            playerCol--;
                            if (playerCol < 0) {
                                playerCol = matrix.length - 1;
                            }
                            break;
                        case 'F':
                            System.out.println("Player won!");
                            matrix[playerRow][playerCol] = 'f';
                            printMatrix(matrix);
                            return;
                    }
                    break;
            }

        }

        System.out.println("Player lost!");
        matrix[playerRow][playerCol] = 'f';
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(chars[col]);
            }
            System.out.println();
        }
    }
}
