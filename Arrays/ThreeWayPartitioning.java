public class ThreeWayPartitioning {
    class Solution{
        //Function to partition the array around the range such 
        //that array is divided into three parts.
        /**
         * @param array
         * @param a
         * @param b
         */
        public void threeWayPartition(int array[], int a, int b){ // TC = O(n) && SC = O(1)

            int n = array.length;
            int start = 0;
            int end = n-1;

            for(int  i =0 ; i<= end ; i++){
                if(array[i] < a){
                    swap(array , array[i] , array[start]);
                    start++;
                }
                else if(array[i] > b){
                    swap(array , array[i] , array[end]);
                    end--;
                    i--;
                }
            }

        }
        public void swap(int[] arr, int start , int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
        }
    }
        
}
