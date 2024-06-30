//Time: Log(n)
//Auxiliary space: O(1)

public class Solution {
    public static int LowerBound(int []arr, int n, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] >= target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}