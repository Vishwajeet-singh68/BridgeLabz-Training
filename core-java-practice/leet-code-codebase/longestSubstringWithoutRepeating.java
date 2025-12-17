import java.util.*;
public class longestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int arr[]=new int[128];
        int start=0,end=0,max=0;
        for(end=0;end<s.length();end++){
            if(arr[s.charAt(end)]!=0)
                break;
            arr[s.charAt(end)]=1;
        }
        max=end-start;
        while(end < s.length()){
            if(arr[s.charAt(end)]!=0){
                arr[s.charAt(start)]=0;
                start++;
                continue;
            }
            arr[s.charAt(end)]=1;
            max=Math.max(max,end-start+1);
            end++;

        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}