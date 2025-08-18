import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt_4 = 0;
        int cnt_7 = 0;
        String N = sc.next();
        for (char c : N.toCharArray()) {
            switch (c) {
                case '4':
                    ++cnt_4;
                    break;
                case '7':
                    ++cnt_7;
                    break;
                default:
                    break;
            }
        }
        if (cnt_4 + cnt_7 == 4 || cnt_4 + cnt_7 == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
