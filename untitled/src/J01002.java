import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; ++i) {
            long N = sc.nextLong();

            System.out.println((N + 1) * N / 2);
        }

        sc.close();
    }
}
