import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PresentDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int presents = Integer.parseInt(bf.readLine());

        int n = Integer.parseInt(bf.readLine());
        char[][] hood = new char[n][n];
        int niceKids = 0;
        int santaRow = 0;
        int santaCol = 0;

        for (int row = 0; row < n; row++) {
            String line = bf.readLine().replaceAll(" ", "");
            for (int col = 0; col < n; col++) {
                if (line.charAt(col) == 'V') {
                    niceKids++;
                }
                if (line.charAt(col) == 'S') {
                    santaRow = row;
                    santaCol = col;
                    hood[row][col] = '-';
                } else {
                    hood[row][col] = line.charAt(col);
                }
            }
        }

        int happyNiceKids = 0;
        int currentRow = santaRow;
        int currentCol = santaCol;
        String input = "";
        while (!(input = bf.readLine()).equals("Christmas morning")) {
            switch (input) {
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "left":
                    currentCol--;
                    break;
            }
            if ((currentRow < 0 || currentRow >= hood.length) ||
                    (currentCol < 0 || currentCol >= hood.length)) {
                System.out.println("Santa ran ot of presents!");
                hood[santaRow][santaCol] = 'S';
                printMatrix(hood);
                int result = happyNiceKids - niceKids;
                if (result == 0) {
                    System.out.printf("Good job, Santa! %d happy nice kid/s.", happyNiceKids);

                } else {
                    System.out.printf("No presents for %d nice kid/s.", Math.abs(result));
                }
                return;
            }
            switch (hood[currentRow][currentCol]) {
                case 'V':
                    presents--;
                    happyNiceKids++;
                    hood[currentRow][currentCol] = '-';
                    break;
                case 'X':
                    break;
                case 'C':
                    if (currentRow + 1 < hood.length) {
                        if (hood[currentRow + 1][currentCol] == 'X') {
                            presents--;
                            hood[currentRow + 1][currentCol] = '-';
                        } else if (hood[currentRow + 1][currentCol] == 'V') {
                            presents--;
                            happyNiceKids++;
                            hood[currentRow + 1][currentCol] = '-';
                        }

                        if (presents == 0) {
                            System.out.println("Santa ran ot of presents!");
                            output(hood, niceKids, happyNiceKids, currentRow, currentCol);
                            return;
                        }
                    }
                    if (currentRow - 1 >= 0) {
                        if (hood[currentRow - 1][currentCol] == 'X') {
                            presents--;
                            hood[currentRow - 1][currentCol] = '-';
                        } else if (hood[currentRow - 1][currentCol] == 'V') {
                            presents--;
                            happyNiceKids++;
                            hood[currentRow - 1][currentCol] = '-';
                        }

                        if (presents == 0) {
                            System.out.println("Santa ran ot of presents!");
                            output(hood, niceKids, happyNiceKids, currentRow, currentCol);
                            return;
                        }
                    }
                    if (currentCol + 1 < hood.length) {
                        if (hood[currentRow][currentCol + 1] == 'X') {
                            presents--;
                            hood[currentRow][currentCol + 1] = '-';
                        } else if (hood[currentRow][currentCol + 1] == 'V') {
                            presents--;
                            happyNiceKids++;
                            hood[currentRow][currentCol + 1] = '-';
                        }

                        if (presents == 0) {
                            System.out.println("Santa ran ot of presents!");
                            output(hood, niceKids, happyNiceKids, currentRow, currentCol);
                            return;
                        }
                    }
                    if (currentCol - 1 >= 0) {
                        if (hood[currentRow][currentCol - 1] == 'X') {
                            presents--;
                            hood[currentRow][currentCol - 1] = '-';
                        } else if (hood[currentRow][currentCol - 1] == 'V') {
                            presents--;
                            happyNiceKids++;
                            hood[currentRow][currentCol - 1] = '-';
                        }

                        if (presents == 0) {
                            System.out.println("Santa ran ot of presents!");
                            output(hood, niceKids, happyNiceKids, currentRow, currentCol);
                            return;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        output(hood, niceKids, happyNiceKids, currentRow, currentCol);

    }

    private static void output(char[][] hood, int niceKids, int happyNiceKids, int currentRow, int currentCol) {
        hood[currentRow][currentCol] = 'S';
        printMatrix(hood);
        int result = happyNiceKids - niceKids;
        if (result == 0) {
            System.out.printf("Good job, Santa! %d happy nice kid/s.", happyNiceKids);

        } else {
            System.out.printf("No presents for %d nice kid/s.", Math.abs(result));
        }
    }

    private static void printMatrix(char[][] hood) {
        for (char[] chars : hood) {
            for (int col = 0; col < hood.length; col++) {
                System.out.print(chars[col] + " ");
            }
            System.out.println();
        }
    }
}
