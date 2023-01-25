package HashSet;

import java.util.HashSet;

public class Intersection {
    
    public int intersect(int[] a, int[] b){ // TC = O(n)

       HashSet<Integer> set = new HashSet<>();

       int count = 0;

       for(int x : a){
        set.add(x);
       }

       for(int x : b){
        if(set.contains(x)) {
            count++;

            set.remove(x);
        }
       }
       return count;
    }
}
