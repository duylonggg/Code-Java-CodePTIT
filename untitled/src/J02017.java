import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; ++i) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                int num = stack.peek();
                if ((num + arr[i]) % 2 == 0) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }
        System.out.println(stack.size());

        sc.close();
    }
}
