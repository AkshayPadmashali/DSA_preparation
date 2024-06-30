//Time: O(logn)
//Auxiliary Space: O(1)

class Solution {
    public int FindPeakElement(int[] arr) {
        int n = arr.length;

        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        //because we have already handled the first and and the last element being peak case
        int start = 1; 
        int end = n-2;

        while(start <= end){
            int mid = start + (end-start)/2;

            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])){
                return mid;
            }else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1; //This case will never be executed until the input hasn atleast 1 peak in it.
    }
}