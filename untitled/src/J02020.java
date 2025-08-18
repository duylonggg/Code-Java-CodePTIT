import java.util.Scanner;

public class J02020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();
        int[] arr = new int[K];
        for (int i = 0; i < K; ++i) {
            arr[i] = i + 1;
        }
        genCombination(N, K, arr);

        sc.close();
    }

    static void genCombination(int N, int K, int[] arr) {
        int time = 0;

        printArr(arr);
        ++time;

        while (true) {
            int idx = -1;
            for (int i = K - 1; i >= 0; --i) {
                if (arr[i] < N - K + i + 1) {
                    idx = i;
                    break;
                }
            }

            if (idx == -1) {
                System.out.printf("Tong cong co %d to hop", time);
                break;
            }

            arr[idx]++;
            for (int i = idx + 1; i < K; ++i) {
                arr[i] = arr[i - 1] + 1;
            }

            printArr(arr);
            ++time;
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
