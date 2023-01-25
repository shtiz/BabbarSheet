public class Rearrange {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 2, 1,-2 , -8, -9, -1 , -4};

        //System.out.println(rearrange(arr));
    }
    public static  void rearrange(int[] arr){ //TC = O(N) SC = (O)

        int n = arr.length-1;

        int i = 0;
        int j = n;

        while(i<j){

            while(i<= n && arr[i] >= 0 ){
                i++;
            }
            while(j>= 0 && arr[j] < 0){
                j++;
            }

            if(i > j){
                swap(arr,arr[i] ,arr[j]);
            }
            if(i == 0 || i== n) return;

            int k = 0;
            while(k <= n && i<= n){
                swap(arr , arr[k] , arr[i]);
                i = i+1;
                k = k+2;
            }

        }
    }

    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
}
