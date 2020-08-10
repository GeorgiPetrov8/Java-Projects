import java.util.Scanner;

public class TheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = 8;
        int cols = 8;

        char[][] chessTable = readMatrix(rows, cols, scan);

        for (int row = 0; row < chessTable.length; row++) {
            for (int elem = 0; elem < chessTable[row].length; elem++) {
                char currentElement = chessTable[row][elem];

                if (currentElement == 'q') {
                    if (check(chessTable, row, elem)) {
                        System.out.print(row + " ");
                        System.out.print(elem);

                    }

                }
            }
        }


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

    private static boolean check(char[][] chessTable, int row, int elem) {

        if (elem < chessTable[row].length - 1) {

            for (int i = elem + 1; i < chessTable[row].length; i++) { //RightHorizontal yes
                char charToCheck = chessTable[row][i];

                if (charToCheck == 'q') {
                    return false;
                }
            }
        }


        if (elem > 0) {

            for (int i = elem - 1; i >= 0; i--) { //LeftHorizontal yes
                char charToCheck = chessTable[row][i];

                if (charToCheck == 'q') {
                    return false;
                }
            }
        }


        if (row < chessTable.length - 1) {

            for (int i = row + 1; i < chessTable.length; i++) { //DownVertical yes
                char charToCheck = chessTable[i][elem];

                if (charToCheck == 'q') {
                    return false;
                }
            }
        }


        if (row > 0) {

            for (int i = row - 1; i >= 0; i--) { // UpVertical yes
                char charToCheck = chessTable[i][elem];

                if (charToCheck == 'q') {
                    return false;
                }
            }
        }

        if (elem > 0 && row > 0) {

            int uldElement = elem - 1;

            for (int i = row - 1; i > 0; i--) { // UpLeftDiagonal yes
                char charToCheck = chessTable[i][uldElement];

                if (charToCheck == 'q') {
                    return false;
                }
                uldElement--;
            }
        }

        if (elem < chessTable[row].length - 1 && row > 0) {

            int urdElement = elem + 1;

            for (int i = row - 1; i > 0; i--) { // UpRightDiagonal yes
                char charToCheck = chessTable[i][urdElement];

                if (charToCheck == 'q') {
                    return false;
                }
                urdElement++;
            }
        }


        if (elem > 0 && row < chessTable.length - 1 ) {

            int element = elem - 1;

            for (int i = row + 1; i < chessTable.length - 1; i++) { // DownLeftDiagonal
                char charToCheck = chessTable[i][element];

                if (charToCheck == 'q') {
                    return false;
                }
                element--;
            }
        }

        if (elem < chessTable[row].length - 1 && row < chessTable.length - 1) {

            int element1 = elem + 1;

            for (int i = row + 1; i < chessTable.length - 1; i++) { // DownRightDiagonal
                char charToCheck = chessTable[i][element1];

                if (charToCheck == 'q') {
                    return false;
                }
                element1++;
            }
        }

        return true;
    }

}
