package HashSet;
import java.util.*;

public class ArraySubsetofAnotherArray {
    public static boolean isSubset(int[] arr1, int[] arr2) { // TC = O(N)

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;


    }
}
