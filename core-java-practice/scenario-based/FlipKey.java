import java.util.Scanner;

public class FlipKey {

    public String CleanseAndInvert(String input) {

        if (input == null || input.length() < 6) {
            return "";
        }

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                return "";
            }
        }

        input = input.toLowerCase();

        StringBuilder filtered = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ((int)c % 2 != 0) {
                filtered.append(c);
            }
        }

        String reversed = filtered.reverse().toString();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        Program p = new Program();
        String output = p.CleanseAndInvert(input);

        if (output.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + output);
        }
    }
}
