import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N + 5];
            int[] prefixSum = new int[N + 5];

            for (int i = 1; i <= N; ++i) {
                arr[i] = sc.nextInt();
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }

            int middleIdx = -1;
            for (int i = 1; i <= N; ++i) {
                if (prefixSum[i - 1] == prefixSum[N] - prefixSum[i]) {
                    middleIdx = i;
                    break;
                }
            }

            System.out.println(middleIdx);
        }

        sc.close();
    }
}
