import java.util.*;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] spf = buildSPF(2000000);

        long totalSum = 0L;
        for (int i = 1; i <= n; ++i) {
            int v = sc.nextInt();
            while (v > 1) {
                int p = spf[v];
                totalSum += p;
                v /= p;
            }
        }

        System.out.println(totalSum);
    }

    static int[] buildSPF(int n) {
        int[] spf = new int[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                primes.add(i);
            }
            for (int p : primes) {
                long v = 1L * p * i;
                if (v > n) break;
                spf[(int)v] = p;
                if (p == spf[i]) break;
            }
        }
        return spf;
    }
}