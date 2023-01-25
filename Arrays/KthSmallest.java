import java.util.*;

public class KthSmallest {   // time complexity = O(nlogn)
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        
        return arr[k-1];
    } 
    
}

// Method 2 (Heap method)
