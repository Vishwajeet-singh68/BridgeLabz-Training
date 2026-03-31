package strings;
import java.util.*;
public class CompareResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = in.next();
        System.out.println("Enter second string:");
        String str2 = in.next();
        boolean result1 = compareStrings(str1, str2);
        boolean result2 = str1.equals(str2);
        System.out.println("Result using charAt(): " + result1);
        System.out.println("Result using equals(): " + result2);
    }

    //comparing two strings using charAt() method
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
