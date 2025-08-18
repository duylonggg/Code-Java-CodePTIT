import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 1; i <= T; ++i) {
            int N = sc.nextInt(), M = sc.nextInt();

            int[][] matrix = new int[N][M];
            for (int row = 0; row < N; ++row) {
                for (int col = 0; col < M; ++col) {
                    matrix[row][col] = sc.nextInt();
                }
            }

            int[][] matrixT = new int[M][N];
            for (int row = 0; row < N; ++row) {
                for (int col = 0; col < M; ++col) {
                    matrixT[col][row] = matrix[row][col];
                }
            }

            int[][] res = multiply(matrix, matrixT);

            System.out.printf("Test %d:\n", i);
            for (int row = 0; row < N; ++row) {
                for (int col = 0; col < N; ++col) {
                    System.out.printf("%d ", res[row][col]);
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }

    static int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < B[0].length; ++j) {
                for (int k = 0; k < A[0].length; ++k) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return res;
    }
}
