import java.io.*;
import java.util.*;

public class J02022 {
    static int N;
    static boolean[] used;
    static int[] perm;
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(readAll(br));
        if (!st.hasMoreTokens()) {
            System.out.print("");
            return;
        }
        int T = Integer.parseInt(st.nextToken());
        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(st.nextToken());
            used = new boolean[N + 1];
            perm = new int[N];
            dfs(0);
            out.append('\n');
        }
        System.out.print(out.toString());
    }

    static void dfs(int pos) {
        if (pos == N) {
            for (int i = 0; i < N; i++) out.append(perm[i]);
            out.append('\n');
            return;
        }
        for (int d = 1; d <= N; d++) {
            if (used[d]) continue;
            if (pos > 0 && Math.abs(perm[pos - 1] - d) == 1) continue;
            used[d] = true;
            perm[pos] = d;
            dfs(pos + 1);
            used[d] = false;
        }
    }

    static String readAll(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        boolean first = true;
        while ((line = br.readLine()) != null) {
            if (!first) sb.append('\n');
            sb.append(line);
            first = false;
        }
        return sb.toString();
    }
}
