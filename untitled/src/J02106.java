import java.util.*;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= N; ++i) {
            int bit1 = 0, bit0 = 0;
            for (int j = 1; j <= 3; ++j) {
                int bit = sc.nextInt();
                bit1 += bit & 1;
                bit0 += bit ^ 1;

            }
            if (bit1 > bit0) {
                ++res;
            }
        }
        System.out.println(res);

        sc.close();
    }
}
