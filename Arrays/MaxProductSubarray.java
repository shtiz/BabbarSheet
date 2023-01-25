public class MaxProductSubarray {
    class Solution {
        public int maxProduct(int[] nums) { // TC = O(n) + O(n) and SC = O(1)

            int max = Integer.MIN_VALUE;
            int product = 1;
            int n = nums.length;
             

            // From left to right
            for(int  i = 0; i<n ;i++ ){
                product = product*nums[i];
                max = Math.max(max , product);

                if(product == 0){
                    product= 1;
                }
            }
            // If starting element is -ve (From right to left)
            product = 1;
            for(int i = n-1; i>=0 ; i--){
                product = product*nums[i];
                max = Math.max(max , product);

                if(product == 0){
                    product = 1;
                }
            }
            return max;

        }
    }
}
