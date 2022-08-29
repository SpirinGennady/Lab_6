
class MatrixSum {
    public static int N = 3;    // ������ �������

    public static void main(String[] args) {

        double[][] A = new double[N][N];
        double[][] B = new double[N][N];
        double[][] C = new double[N][N];
        double[][] D = new double[N][N];
        int m = 2;

        // ���������� � ������ �� ����� ������� A
        System.out.println(" ������� A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }

        // ���������� � ������ �� ����� ������� B
        System.out.println("\n ������� B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(" " + B[i][j]);
            }
            System.out.println();
        }

        // ����� ������
        System.out.println("\n ����� ������ A � B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" " + C[i][j]);
            }
        }

        // �������� �� �����
        System.out.println("\n ��������� ������ �� 2");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                D[i][j] = A[i][j] + B[i][j] * m;
                System.out.print(" " + D[i][j]);
            }
            System.out.println();
        }
    }
}
