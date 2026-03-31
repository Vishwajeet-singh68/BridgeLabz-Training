import java.util.*;

public class LexicalTwist {

    static boolean isInvalid(String s) {
        return s.trim().contains(" ");
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (isInvalid(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (isInvalid(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        String revFirst = new StringBuilder(first).reverse().toString();
        if (revFirst.equalsIgnoreCase(second)) {

            
            String result = revFirst.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println(result);
        } 
        else {
            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;

            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (isVowel(c)) vowels++;
                    else consonants++;
                }
            }

            if (vowels > consonants) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char c : combined.toCharArray()) {
                    if (isVowel(c)) set.add(c);
                    if (set.size() == 2) break;
                }
                for (char c : set) System.out.print(c);
            } 
            else if (consonants > vowels) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char c : combined.toCharArray()) {
                    if (!isVowel(c) && Character.isLetter(c)) set.add(c);
                    if (set.size() == 2) break;
                }
                for (char c : set) System.out.print(c);
            } 
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
