import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int sqrt = (int) Math.sqrt(N);
            if (sqrt * sqrt == N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
