public class RotateByK {

    class Solution {
        public void rotate(int[] nums, int k) { // TC = O(n)
    
            int  n = nums.length;
             k = k%n;
    
            reverseArray(nums , 0 , n-1);
            reverseArray(nums , 0 , k-1);
            reverseArray(nums, k , n-1);
            
        }
        public void reverseArray(int[] nums , int start , int end){
    
            if(start > end){
                return;
            }
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            
    
            reverseArray(nums , start+1 , end-1);
        }
    }
    
}
