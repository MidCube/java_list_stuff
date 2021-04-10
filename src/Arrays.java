public class Arrays {

    public static float[][] identity_2d(int n) {
        float[][] identity = new float[n][n];
        for (int i = 0; i<n; i++ ) {
            identity[i][i] = 1.f;
        }
        return identity;
    }

    public static void transpose(float[][] matrix) {
        int n = matrix.length;
        for (int i=0; i<n;i++) {
            for (int j = 0+i; j<n;j++) {
                float temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
