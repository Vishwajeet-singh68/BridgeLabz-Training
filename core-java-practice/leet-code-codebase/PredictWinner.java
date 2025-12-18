class Solution {
    public boolean predictTheWinner(int[] nums) {
        return rec(nums,0,nums.length-1,0,0,true);
    }
    public static boolean rec(int[] nums,int start, int end,int one, int two,boolean flag){
        if(start>end){
            return one>=two;
        }
        if(flag){
            return rec(nums, start+1,end, one+nums[start],two,!flag) || rec(nums, start,end-1, one+nums[end],two,!flag);
        }
        else{
            return rec(nums, start+1,end, one,two+nums[start],!flag) && rec(nums, start,end-1, one,two+nums[end],!flag);
        }
    }
}   public class PredictWinner {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 5, 2}; 
        boolean result = solution.predictTheWinner(nums);
        System.out.println("Can Player 1 win? " + result);
    }
}   