import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine().trim());
        while (T-- > 0) {
            String name = sc.nextLine();

            String normalized = normalize(name);
            System.out.println(normalized);
        }
    }

    static String normalize(String name) {
        name = name.replaceAll("\\s+", " ").trim().toLowerCase();

        String[] words = name.split(" ");
        for (int i = 0; i < words.length; ++i) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return String.join(" ", words);
    }
}
