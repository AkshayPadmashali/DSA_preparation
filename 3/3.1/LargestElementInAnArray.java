import java.util.* ;
import java.io.*; 

public class Solution {

    static int LargestElementInAnArray(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;

        for(int number: arr){
            if(number > max){
                max = number;
            }
        }
        return max;
    }
}