package Matrix;

public class SearchIn2D {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
    
            int r = binarySearchRowSelect(matrix , target);
    
            boolean  isFound = binarySearch(matrix , r , target);
    
            return isFound;
        }
    
    
           public boolean binarySearch(int[][] matrix , int row , int target){
    
               int lo = 0;
               int hi = matrix[0].length;
    
               while(lo <= hi){
                   int mid  = lo + (hi - lo)/2;
    
                   if(matrix[row][mid] == target){
                       return true;
                   }
                   else if(matrix[row][mid] > target){
                       hi = mid-1;
                   }
                   else{
                       lo = mid+1;
                   }
               }
               return false;
           }
           
    
           public int binarySearchRowSelect(int[][] matrix , int target){
               
               
               int lo = 0;
               int hi = matrix.length;
               int lowestCount = matrix[0].length-1;
    
               
    
               while(lo <= hi){
                   int mid = lo + (hi - lo)/2;
    
                   if(matrix[mid][0] <= target && target <= matrix[mid][lowestCount]){
                       return mid;
                   }
                   else if(matrix[mid][0] < target){
                       lo = mid+1;
                   }
                   else if(matrix[mid][0] > target){
    
                       hi = mid-1;
    
                   }
               }
    
               return -1;
    
    
           }
        
    }
    /*public boolean searchMatrix2(int[][] matrix, int target) {

        int 
    }*/

}
