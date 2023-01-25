import java.util.*;

public class MedianOfTwoSortedArrays {

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) { // TC = O[nlogn] && SC = O(n)

            double[] arr = new double[nums1.length + nums2.length];

            for(int i=0 ; i<arr.length ; i++){
                if(i<nums1.length){
                    arr[i] = nums1[i];
                }else arr[i] = nums2[arr.length - i -1];
            }
            Arrays.sort(arr);
            if(arr.length%2 != 0){
                return arr[arr.length/2];
            }
            else return (arr[arr.length/2] + arr[(arr.length-1)/2])/2;

        }
    }
    // Method 2 
    // Most optimised 
    // TC = O(m + n) && SC = O(1)
 
    public static double findMedianSortedArrays2(int[] a , int[] b){

        if(a.length > b.length){
            int[] temp = a;
            a = b;
            b = temp;
        }

        int lo = 0;
        int hi = a.length;
        int te = a.length + b.length;

        while(lo <= hi){
            int aleft = (lo + hi)/2;
            int bleft = (te + 1)/2 - aleft;

            //alml -> a[left-1]
            // al -> a[left]
            // To check the edge case of ->  Index out of bound
            int alml = (aleft == 0) ? Integer.MAX_VALUE : a[aleft-1];
            int al   = (aleft == a.length) ? Integer.MIN_VALUE : a[aleft];
            int blml = (bleft == 0) ? Integer.MAX_VALUE : b[bleft-1];
            int bl   = (bleft == b.length) ? Integer.MIN_VALUE : b[bleft];
            
            // when valid seggregation is found
            if(alml <= bl && blml <= al){
                double median  = 0.0;

                if(te%2 == 0){
                    int lmax = Math.max(alml , blml);
                    int rmin = Math.min(al , bl);
                    median = (lmax + rmin)/2.0;
                }

                else{
                    int lmax = Math.max(alml , blml);
                    median  = lmax;

                }
                return median;
            }
            else if(alml > bl){
                hi = aleft-1;
            }
            else if(blml > al){
                lo = aleft+1;
            }
        }
        return 0.0;
    }

    
}
