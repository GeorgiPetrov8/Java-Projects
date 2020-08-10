package JediGalaxy;

public class Field {
    private int[][] matrix;

    public Field(int rows, int cols) {
        this.matrix = new int[rows][cols];
        this.generateMatrix();
    }

    private void generateMatrix() {
        int value = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                matrix[row][col] = value++;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
