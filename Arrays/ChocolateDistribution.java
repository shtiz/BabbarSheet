import java.util.*;
public class ChocolateDistribution {

    class Solution
    {
        public long findMinDiff(ArrayList<Integer> a, int n, int m) // TC = O(n) && SC = O(1)
        {
            // your code here
            long ans = Integer.MAX_VALUE;
            
            Collections.sort(a);
            
            for(int i =0 ; i<=a.size()-m ; i++){
                long minw =a.get(i);
                long maxw = a.get(i+(int)m-1);
                long diff = maxw -minw;
                
                if(diff<ans) ans = diff;
            }
            return ans;
        }
    }
    
}
