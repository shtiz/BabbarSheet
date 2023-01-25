public class Jump {
    class Solution {
        public boolean canJump(int[] nums) { // TC = O(n) SC = O(1)

            int n = nums.length - 1;

            for(int  i = nums.length-1 ; i>= 0 ; i--){
                if(nums[i] + i >= i){
                    n = i;
                }
            }

            if(n == 0 ) return true;
            else return false;
        }
    }
}
