import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 1; i <= T; ++i) {
            int N = sc.nextInt();

            Set<Integer> set = new LinkedHashSet<>();
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = 1; j <= N; ++j) {
                int x = sc.nextInt();
                set.add(x);
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            System.out.printf("Test %d:\n", i);
            for (int num : set) {
                System.out.printf("%d xuat hien %d lan\n", num, map.get(num));
            }
        }
    }
}
