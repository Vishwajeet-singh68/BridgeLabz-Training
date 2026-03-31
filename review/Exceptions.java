package questions;

import java.util.Scanner;

public class Exceptions {
    static Scanner in=new Scanner(System.in);
    public static void divisionByZero(int a, int b){
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void invalidInput(){
        try {
            int number = in.nextInt();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        divisionByZero(5,0);
        invalidInput();
    }
}
