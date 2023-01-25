public class MinimizeHeight {
    class Solution {
        int getMinDiff(int[] arr, int n, int k) { // TC = O(n)

            int max = arr[n-1];
            int min = arr[0];

            int maxDiff = max - min;

            for(int i = 0 ; i<arr.length ; i++){
                if(arr[i]-k < 0)continue;

                max = Math.max(arr[n-1] - k , arr[i-1]+k);
                min = Math.min(arr[0] +k , arr[i-1]-k);

                maxDiff = Math.min(maxDiff , max-min);
            }

            return maxDiff;
        }
    }
}
