
class MatrixSum {
    public static int N = 3;    // Размер матрицы

    public static void main(String[] args) {

        double[][] A = new double[N][N];
        double[][] B = new double[N][N];
        double[][] C = new double[N][N];
        double[][] D = new double[N][N];
        int m = 2;

        // Заполнение и печать на экран матрицы A
        System.out.println(" Матрица A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }

        // Заполнение и печать на экран матрицы B
        System.out.println("\n Матрица B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + B[i][j]);
            }
            System.out.println();
        }

        // Сумма матриц
        System.out.println("\n Сумма матриц A и B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" " + C[i][j]);
            }
        }

        // Умножние на число
        System.out.println("\n Умножение матриц на 2");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                D[i][j] = A[i][j] + B[i][j] * m;
                System.out.print(" " + D[i][j]);
            }
            System.out.println();
        }
    }
}
