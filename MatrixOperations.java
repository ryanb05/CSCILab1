public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int counter = 1;
        // Fill matrix with values
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = counter++;
            }
        }
        // Display matrix
        System.out.println("Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        // Transpose matrix
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[col][row] + " ");
            }
            System.out.println();
        }
    }
}
