import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; ++j) {
                int val = sc.nextInt();
                if (val == 1) {
                    list.add(j + 1);
                }
            }

            System.out.printf("List(%d) =", i + 1);
            for (int num : list) {
                System.out.print(" " + num);
            }
            System.out.println();
        }

        sc.close();
    }
}
