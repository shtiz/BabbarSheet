public class Kadane {
    /*Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
      Output: 6
      Explanation: The subarray [4,-1,2,1] has the largest sum 6. 
    */
    class Solution {
        public int maxSubArray(int[] nums) { //TC = O(n)
    
            int sum = nums[0];
            int max = nums[0];
    
            for(int i = 1 ; i<nums.length ; i++){
                sum = Math.max(nums[i] , nums[i] + sum);
                max = Math.max(max , sum);
            }
            return max;
        }
    }
}
