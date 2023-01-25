public class MinimumSizeSubArraySum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {

            int n = nums.length;
            int length = n+1;
            int start = 0;
            int end = 0;
            int sum = 0;

            while(end < n){
                
                sum += nums[end++];

                while(sum >= target){
                    length = Math.min(length , end-start);
                    sum = sum -nums[start++];
                }
            }
            if(length != n+1) return length;

            else return 0;

            

        }
    }
}
