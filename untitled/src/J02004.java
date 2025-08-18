import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; ++i) {
                array[i] = sc.nextInt();
            }
            System.out.println(check(array));
        }

        sc.close();
    }

    static String check(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            if (array[i] != array[array.length - 1 - i]) {
                return "NO";
            }
        }
        return "YES";
    }
}
