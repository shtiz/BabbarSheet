public class CountInversion {
     // TC = O(N logN)
     // SC = O(N)
    public static long inversionCount2(long arr[])
    {
        return mergeSortInplace(arr,0L,arr.length);
    }

    public static long mergeSortInplace(long[] arr, long s , long e){
        if(e-s==1L) return 0;

        long mid = (s+e)/2L;
        long ans=0L;
        if(s<e){
            ans+=mergeSortInplace(arr,s,mid);
            ans+=mergeSortInplace(arr,mid,e);
            ans+=mergeInPlace(arr,s,mid,e); }
        return  ans;
    }

    // fun for merging the sorted arrays.
    public static long mergeInPlace(long[] arr, long s,long m, long e){
        long[] mix = new long[(int)(e-s)];

        long i=s; // ptr for 1st
        long j=m; // prt for 2nd
        long k=0L; // ptr for ans array
        long count=0L;

        while(i< m && j< e){
            if(arr[(int)i]<=arr[(int)j]){
                mix[(int)k]=arr[(int)i];
                i++;
            }
            else{
                mix[(int)k]=arr[(int)j];
                count+=((m)-(i));
                j++;
            }
            k++;
        }

        // There may be arrays with different sizes.
        // only 1 of these 2 while loops will be executed.

        while(i< m){
            mix[(int)k]=arr[(int)i];
            i++;
            k++;
        }

        while(j< e){
            mix[(int)k]=arr[(int)j];
            j++;
            k++;
        }

        for(long l = 0;l<mix.length;l++){
            arr[(int)(s+l)]=mix[(int)l];
        }
        return count;
    }

}

