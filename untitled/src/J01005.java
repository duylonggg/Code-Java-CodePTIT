import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            double H = sc.nextDouble();

            for (int i = 1; i < N; ++i) {
                double yi = H * Math.sqrt((double) i / N);

                System.out.printf("%.6f", yi);

                if (i < N - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
