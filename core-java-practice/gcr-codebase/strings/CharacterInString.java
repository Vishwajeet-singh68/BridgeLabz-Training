package strings;
import java.util.*;
public class CharacterInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();

        char[] charsUsingCharAt = getCharsUsingCharAt(str);
        char[] charsUsingBuiltIn = str.toCharArray();

        System.out.println("Characters using charAt(): " + Arrays.toString(charsUsingCharAt));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(charsUsingBuiltIn));

        boolean areEqual = compareCharArrays(charsUsingCharAt, charsUsingBuiltIn);
        System.out.println("Are both character arrays equal? " + areEqual);
    }

    // Method to get characters using charAt()
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
