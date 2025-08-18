import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine().trim());
        while (T-- > 0) {
            String name = sc.nextLine();

            System.out.println(normalize(name));
        }

        sc.close();
    }

    static String normalize(String name) {
        name = name.replaceAll("\\s+", " ").trim().toLowerCase();

        String[] words = name.split(" ");
        for (int i = 0; i < words.length; ++i) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        String name2 = "";
        for (int i = 1; i < words.length; ++i) {
            if (i != 1) name2 += " ";
            name2 += words[i];
        }
        name2 += ", " + words[0].toUpperCase();

        return name2;
    }
}
