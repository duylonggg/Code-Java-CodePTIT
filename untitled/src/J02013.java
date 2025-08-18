import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        BubbleSort(arr, N);
    }

    static void BubbleSort(int[] arr, int N) {
        for (int i = 0; i < N - 1; ++i) {
            boolean flag = true;
            for (int j = 0; j < N - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;
            System.out.printf("Buoc %d: ", i + 1);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
