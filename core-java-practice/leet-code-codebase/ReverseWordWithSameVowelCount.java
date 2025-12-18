class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        int vowel = countVowels(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int count = countVowels(arr[i]);
            if (count == vowel) {
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }

        return String.join(" ", arr);
    }

    private int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}public class ReverseWordWithSameVowelCount {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "hello apple world umbrella";
        String result = solution.reverseWords(s);
        System.out.println("Reversed words: " + result);
    }
}