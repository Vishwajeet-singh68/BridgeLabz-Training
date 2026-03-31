package arrays;

import java.util.*;
public class InputMultipleArrayElement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = new int[10];
		int index = 0;
		double sum = 0;
		while(true) {
			System.out.println("Enter the element for position: "+index);
			int x = in.nextInt();
			if(x > 0) {
				array[index] = x;
				sum += array[index];
				index++;
			} else if ( x <= 0 || index == 10) {
				break;
			}
		}
		System.out.println("Sum of array elements is: "+sum);
	}
}