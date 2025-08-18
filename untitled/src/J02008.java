import java.util.*;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long lcm = 1;
            for (int i = 2; i <= n; ++i) {
                lcm = lcm(lcm, i);
            }
            System.out.println(lcm);
        }
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
