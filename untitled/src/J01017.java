import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            String N = sc.next();
            System.out.println(check(N));
        }
    }

    static String check(String N) {
        for (int i = 1; i < N.length(); ++i) {
            if (Math.abs(N.charAt(i) - N.charAt(i - 1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
