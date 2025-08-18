import java.util.*;

public class J01021 {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(binPow(a, b));
        }
    }

    static long binPow(long a, long b) {
        a %= MOD;
        if (b == 0) return 1;
        long half = binPow(a, b / 2);
        long result = (half * half) % MOD;
        if (b % 2 == 1) result = (result * a) % MOD;
        return result;
    }
}
