package strings;
import java.util.*;
public class SubstringUsingMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str = in.nextLine();
        System.out.println("Enter start index:");
        int start = in.nextInt();
        System.out.println("Enter end index:");
        int end = in.nextInt();

        String substringUsingCharAt = getSubstringUsingCharAt(str, start, end);
        String substringUsingBuiltIn = str.substring(start, end);

        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in method: " + substringUsingBuiltIn);

        boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }

    // Method to create substring using charAt()
    public static String getSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
