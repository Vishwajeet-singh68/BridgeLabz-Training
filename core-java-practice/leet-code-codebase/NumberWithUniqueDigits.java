class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 10;
        int sum=10,prod=9,mul=9;
        for(int i=2;i<=n;i++){
            prod*=mul;
            mul--;
            sum+=prod;
        }   
        return sum;
    }
}public class NumberWithUniqueDigits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2; 
        int result = solution.countNumbersWithUniqueDigits(n);
        System.out.println("Count of numbers with unique digits for n = " + n + " is: " + result);
    }
}