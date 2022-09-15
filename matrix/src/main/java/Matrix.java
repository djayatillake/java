import java.util.Arrays;

class Matrix {
    private int[][] rows;
    Matrix(String matrixAsString) {
        rows = new int[matrixAsString.split("\\n").length][matrixAsString.split("\\n")[0].split(" ").length];
        String[] rawrows = matrixAsString.split("\\n");
        for (int i = 0; i < rawrows.length; i++) {
            String[] rawrow = rawrows[i].split(" ");
            for (int j = 0; j < rawrow.length; j++) {
                this.rows[i][j] = Integer.parseInt(rawrow[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return rows[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[rows.length];
        for (int i = 0; i < column.length; i++) {
            column[i] = rows[i][columnNumber-1];
        }
        return column;
    }
}
