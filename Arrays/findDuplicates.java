public class findDuplicates {

    class Solution {
    public int findDuplicate(int[] arr) { // TC = O(n)

        int i = 0;

        while(i<arr.length){

            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    swap(arr , i , correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public void swap(int[] arr , int start , int end){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

    
    
}
