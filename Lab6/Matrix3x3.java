public class Matrix3x3 {
    protected int[][] data = new int[3][3];

    public void setMatrix(int[][] matrixData) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.data[i][j] = matrixData[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void printTransposed() {
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[j][i] + "\t");
            }
            System.out.println();
        }
    }
}