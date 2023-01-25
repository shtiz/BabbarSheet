package Matrix;

public class MedianRowWiseSorted {
    class Solution {
        int median(int matrix[][], int R, int C) {
            // code here 
            int startVal=0,endVal=2000,midVal;
            int n=R*C;
            while(startVal<=endVal)
            {
                midVal=(endVal+startVal)/2;
                int ans=0;
                for(int i=0;i<R;i++)
                {
                    int l=0,h=C-1;
                    while(l<=h)
                    {
                        int m=l+(h-l)/2;
                        if(matrix[i][m]<=midVal) l=m+1;
                        else h=m-1;
                    }
                    ans+=l;
                }
                if(ans<=n/2) startVal=midVal+1;
                else endVal=midVal-1;
            }
            return startVal;
            
          
       
        }
    }
}
