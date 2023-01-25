class Solution
{ 
    public static int findSum(int A[],int N)  // time complexity  = O(n)i
    {
        int min = A[0] ;
        int max = A[0];
        for(int  i = 1 ; i<N; i++){
            
            if(min> A[i]){
                 min = A[i];
            }
            if(max < A[i])
             max = A[i];
    
             
        }
       
       return min + max; 
        
    }
}