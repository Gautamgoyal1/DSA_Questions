import java.util.*;

public class Mai {

    static List<String> makeSubstrings(String s) {

        List<String> result = new ArrayList<>();

        boolean[] used = new boolean[s.length()];

        int remaining = s.length();

        while (remaining > 0) {

            StringBuilder sub = new StringBuilder();
            for (int i = 0; i < s.length() && sub.length() < 3; i++) {
                if (used[i]) {
                    continue;
                }
                char ch = s.charAt(i);
                if (sub.indexOf(String.valueOf(ch)) != -1) {
                    continue;   // DON'T mark used
                }
                sub.append(ch);
                used[i] = true;
                remaining--;
            }
            while (sub.length() < 3) {
                char next;
                if (sub.length() == 0) {
                    next = 'a';
                } else {
                    next = (char)(sub.charAt(sub.length() - 1) + 1);
                }
                if (sub.indexOf(String.valueOf(next)) == -1) {
                    sub.append(next);
                }
            }
            result.add(sub.toString());
        }
        return result;
    }
    public static void main(String[] args) {

        String s = "aaa";

        System.out.println(makeSubstrings(s));
    }
}