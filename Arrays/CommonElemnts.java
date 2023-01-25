import java.util.*;

public class CommonElemnts { // TC = O(N)
    class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3){ 
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = 0; int j = 0; int k = 0;
        
        int prev1; int prev2; int prev3;
        prev1 = prev2 = prev3 = -1;
        
        while(i < n1 && j<n2 && k<n3){
            
            while(A[i] == prev1 &&  i <n1) 
             i++;
            while(B[j] == prev2 && j<n2)
              j++;
            while(C[k] == prev3 && k<n3) 
             k++;
            
            if(A[i] == B[j] && B[j] == C[k]){
                res.add(A[i]);
                
                prev1 = A[i];
                prev2 = B[j];
                prev3 = C[k];
                
                i++;
                j++;
                k++;
            }
            else if(A[i] < B[j]){
                prev1 = A[i];
                i++;
            }
            else if(B[j] < C[k]){
                prev2 = B[j];
                j++;
            }
            else{
                prev3 = C[k];
                k++;
            }
        }
        return res;
        
    }
    
}
}
