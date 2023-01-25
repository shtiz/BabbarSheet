package HashSet;

import java.util.*;

public class Union {
    public int union(int[] a , int[] b){ // TC = O(n)

        HashSet<Integer> set = new HashSet<>();

        for(int x : a){
            set.add(x);
        }
        for(int x : b){
            set.add(x);
        }
         return set.size();
         }
}
