package questions;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.*;
public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int largest=arr[0],secondLargest=-1;

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest) {
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        System.out.println(secondLargest);
    }
}
