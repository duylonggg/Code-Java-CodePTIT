import java.util.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; ++i) {
            long N = sc.nextLong();

            System.out.printf("Test %d:", i);

            Map<Long, Integer> map = solve(N);

            for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                System.out.printf(" %d(%d)", entry.getKey(), entry.getValue());
            }
            System.out.println();
            System.out.println();
        }

        sc.close();
    }

    public static Map<Long, Integer> solve(long N) {
        Map<Long, Integer> map = new TreeMap<>();
        long i = 2;
        while (i <= N / i) {
            while (N % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                N /= i;
            }
            ++i;
        }
        if (N > 1) {
            map.put(N, map.getOrDefault(N, 0) + 1);
        }
        return map;
    }
}