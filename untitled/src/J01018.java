import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            String N = sc.next();
            System.out.println(check(N));
        }

        sc.close();
    }

    static String check(String N) {
        for (int i = 0; i < N.length() - 1; ++i) {
            if (Math.abs(N.charAt(i) - N.charAt(i + 1)) != 2) {
                return "NO";
            }
        }

        int total = 0;
        for (char c : N.toCharArray()) {
            total += c - '0';
        }
        if (total % 10 != 0) {
            return "NO";
        }

        return "YES";
    }
}
