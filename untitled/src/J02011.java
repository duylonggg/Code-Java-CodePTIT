import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        InsertionSort(arr, N);
    }

    static void InsertionSort(int[] arr, int N) {
        for (int i = 0; i < N - 1; ++i) {
            int minIdx = i;
            for (int j = i + 1; j < N; ++j) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.printf("Buoc %d: ", i + 1);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
       }
    }
}
