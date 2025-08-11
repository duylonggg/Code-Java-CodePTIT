import java.util.Scanner;

public class J01004 {
    public static String isPrime(long N) {
        if (N <= 1) {
            return "NO";
        } if (N <= 3) {
            return "YES";
        } if (N % 2 == 0 || N % 3 == 0) {
            return "NO";
        }

        for (long i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return "NO";
            }
        }

        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println(isPrime(N));
        }

        sc.close();
    }
}
