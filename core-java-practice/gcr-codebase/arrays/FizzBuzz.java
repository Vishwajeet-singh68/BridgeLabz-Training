// Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
// Hint => 
// Create a String Array to save the results and 
// Finally, loop again to show the results of the array based on the index position

package arrays;

import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number <= 0) {
            System.out.print("Error : Not a natural number.");
            return;
        }
        
        String[] fizzBuzzArray = new String[number];
        
        for(int i=0;i<number;i++) {
            if(i%15==0) {
                fizzBuzzArray[i] = "FizzBuzz";
            }
            else if(i%3==0) {
                fizzBuzzArray[i] = "Fizz";
            }
            else if(i%5==0) {
                fizzBuzzArray[i] = "Buzz";
            }
            else {
                fizzBuzzArray[i] = Integer.toString(i);
            }
        }
        
        for(int i=0;i<number;i++) {
            System.out.println("Position "+(i+1)+" = "+fizzBuzzArray[i]);
        }
    }
}
