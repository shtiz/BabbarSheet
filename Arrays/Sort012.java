import java.util.*;

public class Sort012 {  // Time complexity = O(nlogn)
 
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
    }


// Optimization ke liye dusra method use kr rhe h 

// Count of 0 , 1 , 2

public static void sorts012(int nums[], int n){  // TC = O(4*n)
    
    int zero = 0; int one = 0; int two = 0;

    for(int i=0; i<nums.length ; i++){
        if(nums[i] == 0) zero++;
        if(nums[i] == 1) one++;
        if(nums[i] == 2) two++;
    }

    for(int i = 0 ; i<zero ; i++)nums[i] = 0;
    for(int i = zero ; i<zero+one ; i++)nums[i] = 1;
    for(int i = zero+one ; i<nums.length ; i++)nums[i] = 2;

     
}
}
    
    

