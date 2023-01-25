package Matrix;

public class RowWithMax1 {

    // Method 1
    // TC = O(nlogm) && SC = O(1)

    class Solution {
        int rowWithMax1s(int arr[][], int n, int m) {

            int maxOne = 0 , maxOneRow = 0;
            for(int i = 0 ; i<n ; i++){
                int maxCountOne = binarySearch(arr , i);
                
                if(maxCountOne > maxOne){
                    maxOneRow = i;
                }
            }
            return maxOneRow;
        }
        int binarySearch(int[][] arr , int r){
        
            int lo = 0;
            int hi = arr[0].length-1;
            int maxCol = arr[0].length;
            
            
            while(lo <= hi){
                int mid = (hi+lo)/2;
                
                if(arr[r][mid] == 1){
                maxCol  = mid;
                hi = mid-1;
                }
                else {
                    lo = mid+1;
                }
                
            }
            int count = arr[0].length - maxCol;
            return count;    
        }
    }

        //Method 2 (More Optimised )
        // TC = O(n) && SC = O(1)
 
        int rowWithMax1s2(int arr[][], int n, int m) {

            int i =0;
            int j = m-1;
            int maxOneRow =0;

            while(i <n && j>=0){
                
                if(arr[i][j] == 1){
                    maxOneRow = i;
                    j--;

                }
                else i++;
            
            }
            return maxOneRow;
        }
}
    

