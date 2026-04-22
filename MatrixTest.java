public class MatrixTest {

    private static int testsRun = 0;
    private static int testsPassed = 0;

    public static void main(String[] args) {
        testReverseAllRows();
        testReverseMatrix();

        System.out.println();
        System.out.println("Tests passed: " + testsPassed + "/" + testsRun);

        if (testsPassed != testsRun) {
            throw new AssertionError("One or more tests failed.");
        }
    }

    private static void testReverseAllRows() {
        // Test reverseAllRows with 2x3 matrix
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected1 = {{3, 2, 1}, {6, 5, 4}};
        Matrix m1 = new Matrix(matrix1);
        m1.reverseAllRows();
        assertTrue(matricesEqual(matrix1, expected1), "reverseAllRows: 2x3 matrix should reverse each row");

        // Test reverseAllRows with 3x3 matrix
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected2 = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        Matrix m2 = new Matrix(matrix2);
        m2.reverseAllRows();
        assertTrue(matricesEqual(matrix2, expected2), "reverseAllRows: 3x3 matrix should reverse each row");

        // Test reverseAllRows with 1x4 matrix (single row)
        int[][] matrix3 = {{1, 2, 3, 4}};
        int[][] expected3 = {{4, 3, 2, 1}};
        Matrix m3 = new Matrix(matrix3);
        m3.reverseAllRows();
        assertTrue(matricesEqual(matrix3, expected3), "reverseAllRows: 1x4 matrix should reverse the single row");

        // Test reverseAllRows with 4x1 matrix (single column)
        int[][] matrix4 = {{1}, {2}, {3}, {4}};
        int[][] expected4 = {{1}, {2}, {3}, {4}};
        Matrix m4 = new Matrix(matrix4);
        m4.reverseAllRows();
        assertTrue(matricesEqual(matrix4, expected4), "reverseAllRows: 4x1 matrix should remain unchanged");

        // Test reverseAllRows with 1x1 matrix
        int[][] matrix5 = {{5}};
        int[][] expected5 = {{5}};
        Matrix m5 = new Matrix(matrix5);
        m5.reverseAllRows();
        assertTrue(matricesEqual(matrix5, expected5), "reverseAllRows: 1x1 matrix should remain unchanged");
    }

    private static void testReverseMatrix() {
        // Test reverseMatrix with 2x2 matrix
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] expected1 = {{4, 3}, {2, 1}};
        Matrix m1 = new Matrix(matrix1);
        m1.reverseMatrix();
        assertTrue(matricesEqual(matrix1, expected1), "reverseMatrix: 2x2 matrix should be completely reversed");

        // Test reverseMatrix with 3x3 matrix
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix m2 = new Matrix(matrix2);
        m2.reverseMatrix();
        assertTrue(matricesEqual(matrix2, expected2), "reverseMatrix: 3x3 matrix should be completely reversed");

        // Test reverseMatrix with 4x4 matrix
        int[][] matrix3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] expected3 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix m3 = new Matrix(matrix3);
        m3.reverseMatrix();
        assertTrue(matricesEqual(matrix3, expected3), "reverseMatrix: 4x4 matrix should be completely reversed");

        // Test reverseMatrix with 1x3 matrix
        int[][] matrix4 = {{1, 2, 3}};
        int[][] expected4 = {{3, 2, 1}};
        Matrix m4 = new Matrix(matrix4);
        m4.reverseMatrix();
        assertTrue(matricesEqual(matrix4, expected4), "reverseMatrix: 1x3 matrix should have its single row reversed");

        // Test reverseMatrix with 3x1 matrix
        int[][] matrix5 = {{1}, {2}, {3}};
        int[][] expected5 = {{3}, {2}, {1}};
        Matrix m5 = new Matrix(matrix5);
        m5.reverseMatrix();
        assertTrue(matricesEqual(matrix5, expected5), "reverseMatrix: 3x1 matrix should have rows reversed");

        // Test reverseMatrix with 1x1 matrix
        int[][] matrix6 = {{5}};
        int[][] expected6 = {{5}};
        Matrix m6 = new Matrix(matrix6);
        m6.reverseMatrix();
        assertTrue(matricesEqual(matrix6, expected6), "reverseMatrix: 1x1 matrix should remain unchanged");

        // Test reverseMatrix with 2x3 matrix
        int[][] matrix7 = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected7 = {{6, 5, 4}, {3, 2, 1}};
        Matrix m7 = new Matrix(matrix7);
        m7.reverseMatrix();
        assertTrue(matricesEqual(matrix7, expected7), "reverseMatrix: 2x3 matrix should be completely reversed");
    }

    private static boolean matricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void assertTrue(boolean condition, String message) {
        testsRun++;
        if (condition) {
            testsPassed++;
            System.out.println("PASS - " + message);
        } else {
            System.out.println("FAIL - " + message);
        }
    }
}
