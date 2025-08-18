import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, N);

        sc.close();
    }

    static void selectionSort(int[] arr, int N) {
        for (int i = 0; i < N - 1; ++i) {
            for (int j = i + 1; j < N; ++j) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.printf("Buoc %d: ", i + 1);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}