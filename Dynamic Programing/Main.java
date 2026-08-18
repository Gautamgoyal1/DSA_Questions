import java.util.*;
public class Main {

    public static void main(String[] args) {
        String s = "aabcDEFghijK";
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower.append(ch);
            } else if (Character.isUpperCase(ch)) {
                upper.append(ch);
            }
        }
        System.out.println("Lowercase: " + makeSubstrings(lower.toString()));
        System.out.println("Uppercase: " + makeSubstrings(upper.toString()));
    }
    static List<String> makeSubstrings(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (current.indexOf(String.valueOf(ch)) == -1) {
                current.append(ch);
            }
            if (current.length() == 3) {
                result.add(current.toString());
                current.setLength(0);
            }
        }
        if (current.length() > 0) {
            char last = current.charAt(current.length() - 1);
            while (current.length() < 3) {
                last++;
                if (current.indexOf(String.valueOf(last)) == -1) {
                    current.append(last);
                }
            }
            result.add(current.toString());
        }
        return result;
    }
}