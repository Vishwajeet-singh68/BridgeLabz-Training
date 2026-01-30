package streamapi;

import java.util.*;
public class NameTransformation {
	public static void main(String[] args) {
		List<String> names = List.of("Vishwajeet", "Amit", "Abhishek","lind", "Vipul","harsh");
		
		List<String> transformedNames = names.stream().map(name->name.toUpperCase()).sorted().toList();		
		
		System.out.println(transformedNames);
	}
}
