import java.util.*;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {

          // Most Optimised  Solution with TC = O(n) && SC = O(1)
          // Moore-Voting Algorithm

          int ansIndex = 0;
          int count = 1;

          for(int i = 1 ; i<nums.length ; i++){
            if(nums[ansIndex] == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                ansIndex = i;
                count = 1;
            }
          }
          return ansIndex;
        }
    }
    
    // Method 2
    public int majorityElement1(int[] nums) {

    // TC = O(logn)

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    

    
   
    


    

}
