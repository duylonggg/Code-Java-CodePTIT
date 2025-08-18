import java.util.Scanner;

public class J01024 {
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
        for (char c : N .toCharArray()) {
            if (c != '0' && c != '1' && c != '2') return "NO";
        }
        return "YES";
    }
}
