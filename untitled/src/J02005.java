import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            setB.add(sc.nextInt());
        }

        for (int x : setA) {
            if (setB.contains(x)) {
                System.out.print(x + " ");
            }
        }
    }
}
