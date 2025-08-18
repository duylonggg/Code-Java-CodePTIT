import java.util.Scanner;

public class J01022 {
    static long X[] = new long[93];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        build();
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            System.out.println( Try(N, K) );
        }
    }

    static void build() {
        X[1] = 1;
        X[2] = 1;
        for (int i = 3; i < 93; ++i) {
            X[i] = X[i - 1] + X[i - 2];
        }
    }

    static int Try(int N, long K) {
        if (N == 1) return 0;
        if (N == 2) return 1;
        if (K <= X[N - 2]) {
            return Try(N - 2, K);
        } else {
            return Try(N - 1, K - X[N - 2]);
        }
    }
}
