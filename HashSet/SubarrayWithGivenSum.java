package HashSet;
import java.util.*;

//package HashSet;

public  class SubarrayWithGivenSum {
    
     public int SubArraySum(int[] a , int sum ){
        int currSum = 0;
        int start = 0;
        int end = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i : a){
            currSum += a[i];

            if(currSum - sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start = map.get(currSum-sum) +1;
                end = i;
                break;
            }
            map.put(currSum , i);
        }
        if(end == -1){
            return -1;
        }
        else{
            return sum;
        }


     }
}
