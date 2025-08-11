import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            boolean flag = true;
            for (int i = 0; i < s.length(); ++i) {
                switch (s.charAt(i)) {
                    case '1':
                        sb.append('1');
                        break;
                    case '0':
                    case '8':
                    case '9':
                        sb.append('0');
                        break;
                    default:
                        System.out.println("INVALID");
                        flag = false;
                        break;
                }
                if (!flag) break;
            }
            if (flag) {
                String result = sb.toString();
                result = result.replaceFirst("^0+", "");
                if (result.isEmpty()) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(result);
                }
            }
        }

        sc.close();
    }
}