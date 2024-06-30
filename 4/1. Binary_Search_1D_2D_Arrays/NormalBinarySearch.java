//Time: Log(n)
//Auxiliary space: O(1)

class Solution {
    public int NormalBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return -1;
    }
}