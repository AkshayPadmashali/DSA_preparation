class Solution {
    public int SearchInRotatedSortedArrayFirst(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[start] <= arr[mid]){
                //means left part is sorted
                if((arr[start] <= target) && (target <= arr[mid])){
                    //Does target lies in sorted part if yes, then we will search there
                    end = mid - 1;
                }else{
                    //if no, we will search on other part
                    start = mid + 1;
                }
            }else{
                //means right part is sorted
                if((arr[mid] <= target) && (target <= arr[end])){
                    //Does target lies in sorted part if yes, then we will search there
                    start = mid + 1;
                }else{
                     //if no, we will search on other part
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}