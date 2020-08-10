import java.util.Scanner;

public class Snake {
    public static int currentRow = 0;
    public static int currentCol = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[n][n];


        int burrowsCount = 0;
        int firstBurrowRow = 0;
        int firstBurrowCol = 0;
        int secondBurrowRow = 0;
        int secondBurrowCol = 0;


        for (int r = 0; r < n; r++) {
            String line = scan.nextLine();
            for (int c = 0; c < n; c++) {
                matrix[r][c] = line.charAt(c);
                if (matrix[r][c] == 'S') {
                    matrix[r][c] = '.';
                    currentRow = r;
                    currentCol = c;
                } else if (matrix[r][c] == 'B') {
                    if (burrowsCount == 0) {
                        firstBurrowRow = r;
                        firstBurrowCol = c;
                        burrowsCount++;
                    } else {
                        secondBurrowRow = r;
                        secondBurrowCol = c;
                    }
                }

            }
        }

        int foodCount = 0;

        while (foodCount < 10) {
            String command = scan.nextLine();
            switch (command) {
                case "up":
                    if (matrix[currentRow - 1][currentCol] < 0) {
                        System.out.println("Game over!");
                    } else if (matrix[currentRow - 1][currentCol] == 'B'){
                        if (matrix[currentRow - 1][currentCol] == matrix[firstBurrowRow][firstBurrowCol]) {
                            matrix[firstBurrowRow][firstBurrowCol] = '.';
                            matrix[firstBurrowCol][firstBurrowCol] == matrix[secondBurrowRow][secondBurrowCol];
                        }

                    }
                    break;
                case "down":
                    break;
                case "left":
                    break;
                case "right":
                    break;
            }
        }


    }
}
