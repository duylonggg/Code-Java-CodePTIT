import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] freq = new int[205];
        int maxNum = -1;
        for (int i = 0; i < N; ++i) {
            int num = sc.nextInt();
            ++freq[num];
            maxNum = Math.max(maxNum, num);
        }

        boolean flag = true;
        for (int i = 1; i <= maxNum; ++i) {
            if (freq[i] == 0) {
                System.out.println(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Excellent!");
        }

        sc.close();
    }
}
