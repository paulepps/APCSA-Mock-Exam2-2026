public class Matrix {
    private int[][] mat;

    public Matrix(int[][] m) {
        this.mat = m;
    }

    public void reverseAllRows() {
        for (int i = 0; i < mat.length; i++) {
            ArrayUtil.reverseArray(mat[i]);
        }
    }

    public void reverseMatrix() {
        reverseAllRows();
        int n = mat.length;
        for (int i = 0; i < n / 2; i++) {
            int[] temp = mat[i];
            mat[i] = mat[n - 1 - i];
            mat[n - 1 - i] = temp;
        }
    }
}
