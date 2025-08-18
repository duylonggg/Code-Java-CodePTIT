import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; ++i) {
            array[i] = sc.nextInt();
        }

        InsertionSort(array, N);
    }

    static void InsertionSort(int[] array, int N) {
        for (int i = 0; i < N; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

            System.out.printf("Buoc %d: ", i);
            for (int k = 0; k <= i; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}
