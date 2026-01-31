package collectors;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the paragraph: ");
		String para = in.nextLine();
		
		String arr[] = para.split("[ ,.]+");
		Map<String, Integer> frequency = Arrays.stream(arr).collect(Collectors.toMap(w-> w, w->1,Integer::sum));
		
		frequency.forEach((word, count) ->
        System.out.println(word + " : " + count)
    );
	}
}
