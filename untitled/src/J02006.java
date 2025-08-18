import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> set = new TreeSet<>();

        for (int i = 1; i <= n + m; ++i) {
            set.add(sc.nextInt());
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
