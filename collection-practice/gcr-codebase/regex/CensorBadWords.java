import java.util.*;

public class CensorBadWords {
    public static String censorBadWords(String text, List<String> badWords) {
        List<String> badWords=new ArrayList<>();
        badWords.add("damn");
        badWords.add("stupid");
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }
}
