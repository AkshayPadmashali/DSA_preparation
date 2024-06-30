class Solution {
    public int SingleElementInSortedArray(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0]; //handling first and last element separately
        if(arr[n-1] != arr[n-2]) return arr[n-1]; //handling first and last element separately
        int start = 1;
        int end = n - 2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if((arr[mid] != arr[mid-1]) && (arr[mid] != arr[mid+1])){
                return arr[mid];
            }

            if((mid%2==0 && (arr[mid] == arr[mid+1])) || (mid%2!=0 && (arr[mid-1] == arr[mid]))){
                 //we are in left, eliminate left
                start = mid + 1;
            }else{
                //we are in right, eliminate right
                end = mid - 1;
            }
        }

        return -1;
    }
}