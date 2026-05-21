public class NamedMatrix extends Matrix3x3 {
    String matrixName;
    String creationDate;

    public NamedMatrix(String matrixName, String creationDate) {
        this.matrixName = matrixName;
        this.creationDate = creationDate;
    }

    @Override
    public void printMatrix() {
        System.out.println("Матриця: [" + matrixName + "], Дата створення: " + creationDate);
        super.printMatrix();
    }
}