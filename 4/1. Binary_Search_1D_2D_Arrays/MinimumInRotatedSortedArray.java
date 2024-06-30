class Solution {
    //Basically our answer will lie in unsorted part mostly but there might be a case where our ans could also lie in sorted part.
    //Thats why we pick up the smallest from the sorted part and move forward to the unsorted part.
    //Bcz we know that out of left or the right half one of the side will always be sorted GURU mantra by Striver.
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start)/2;

//If the entire search space is already sorted then we can just pick the min of ans and start and stop the program.
            //This is an extra optmisation step.
            if(arr[start] <= arr[end]){
                ans = Math.min(arr[start], ans);
                break; 
            }

            if(arr[start] <= arr[mid]){
                //means left part is sorted
                ans = Math.min(arr[start], ans);
                start = mid + 1;
            }else{
                //means right part is sorted.
                ans = Math.min(arr[mid], ans);
                end = mid - 1;
            }
        }
        return ans;
    }
}