import java.util.*;

public class UnionArrays {  // TC = O(m + n) // SC = 0
    public static void main(String[] args) {

        int[] arr1 = {1,1,1,2,3,3};
        int[] arr2 = {1,2,2,3,};
        
    
    
    List<Integer> res = new ArrayList<>();

    int i = 0;
    int j= 0;

    while(i<arr1.length || j<arr2.length){

        // Skip duplicate 

        while(i>0 && i<arr1.length && arr1[i] == arr1[i-1]){
            i++;
        }

        
        while(j>0 && j<arr2.length && arr2[j] == arr1[j-1]){
            j++;
        }

        // one array exhausht

        if(i>=arr1.length){
            res.add(arr2[j]);
            j++;
            continue;
        }

        if(j>=arr2.length){
            res.add(arr1[i]);
            i++;
            continue;
        }

    // Comparison
     
     if(arr1[i]<arr2[j]){
        res.add(arr1[i]);
     }
     else if(arr1[i]>arr2[j]){
        res.add(arr2[j]);
     }
     else{
        res.add(arr1[i]);
     }


    }
}
}
