import java.util.Scanner;

public class J01007 {
    static long[] fibonacci = new long[100];

    public static void fibo(long n) {
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; ++i) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }

    public static String checkFibo(long n) {
        for (int i = 0; i < 100; ++i) {
            if (fibonacci[i] == n) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        fibo(100);
        while (T-- > 0) {
            long n = sc.nextLong();
            System.out.println(checkFibo(n));
        }

        sc.close();
    }
}
