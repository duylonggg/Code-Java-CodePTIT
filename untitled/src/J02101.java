import java.util.Scanner;

public class J02101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < N; ++i) {
                if (i % 2 == 0) {
                    for (int j = 0; j < N; ++j) {
                        System.out.print(arr[i][j] + " ");
                    }
                } else {
                    for (int j = N - 1; j >= 0; --j) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
