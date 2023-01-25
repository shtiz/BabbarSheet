package HashSet;
import java.util.*;

public class TripletSumInArray {
    public static boolean find3Numbers(int A[], int n, int X) { // TC = O(n)
    
        // Your code Here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : A){
            set.add(i);
        
        for(int j =i+1 ; j<A.length ; j++){
            if(set.contains(X - A[j] - A[i])){
             return true;   
            }
        }
       }
     return false;
     }
}