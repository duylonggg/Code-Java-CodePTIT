import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;
            
            for (int i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) ++count;
                    if (i != N / i && (N / i) % 2 == 0) ++count;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}