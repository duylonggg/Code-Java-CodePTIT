import java.util.Scanner;

public class J02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                int val = sc.nextInt();
                if (j > i && val == 1) {
                    sb.append('(').append(i + 1).append(',').append(j + 1).append(")\n");
                }
            }
        }
        System.out.print(sb.toString());

        sc.close();
    }
}
