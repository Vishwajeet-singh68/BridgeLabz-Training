package functionalinterface;

import java.util.function.Function;
import java.util.*;

public class StringLengthChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Function<String, Integer> lengthChecker = s->s.length();
		
		int limit = 10;
		System.out.println("Enter the msg: ");
		String s = in.nextLine();
		
		if(lengthChecker.apply(s)>limit) {
			System.out.println("message exceeding message length limitvi.");
		} else {
			System.out.println("mesage is okay!!");
		}
	}
}
