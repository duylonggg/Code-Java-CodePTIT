import java.util.Scanner;

public class J01006 {
    static long[] fibonacci = new long[100];

    public static void fibo(long n) {
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; ++i) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        fibo(100);
        while (T-- > 0) {
            long n = sc.nextLong();
            System.out.println(fibonacci[(int) n]);
        }

        sc.close();
    }
}
