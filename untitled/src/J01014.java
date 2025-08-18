import java.util.Scanner;

public class J01014 {
    static long largestPrimeFactor(long n) {
        long maxPF = -1;
        while (n % 2 == 0) {
            maxPF = 2;
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                maxPF = i;
                while (n % i == 0) n /= i;
            }
        }
        if (n > 1) maxPF = n;
        return maxPF;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println(largestPrimeFactor(N));
        }
        sc.close();
    }
}
