public class Reverse {

class Solution {
    public void reverseString(char[] s) { // time complexity = O(n)

        int  i = 0;
        int j = s.length-1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    // Reverse using Recursion 

    public void reverseString1(char[] s) { // time complexity = { O(n/2) == O(n) } 

        reverseStringRec(s , 0 , s.length-1);
        }
    public void reverseStringRec(char[] s , int start , int end){

        if(start > end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseStringRec(s , start +1 , end-1);
    } 
}  

}