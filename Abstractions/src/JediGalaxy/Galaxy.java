package JediGalaxy;

public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public void setEvil(int evilRow, int evilCol) {
        int[][] matrix = field.getMatrix();
        while (evilRow >= 0 && evilCol >= 0) {
            if (isPositionValid(evilRow, evilCol, matrix)) {
                matrix[evilRow][evilCol] = 0;
            }

            evilRow--;
            evilCol--;
        }
        field.setMatrix(matrix);
    }

    public long getValueOfStars(int jediRow, int jediCol) {
        long valueOfStars = 0;
        int[][] matrix = field.getMatrix();
        while (jediRow >= 0 && jediCol < matrix[1].length) {
            if (isPositionValid(jediRow,jediCol,matrix)) {
                valueOfStars += matrix[jediRow][jediCol];
            }

            jediRow--;
            jediCol++;
        }
        return valueOfStars;
    }

    private boolean isPositionValid(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length
                && col >= 0 && col < matrix[0].length;
    }
}
