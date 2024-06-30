//Solution by Striver
//Time: O(log2n)
//Space: O(1)

class FirstAndLastPositionOfElementInSortedArray {
    public int firstOccurance(int[] arr, int target){
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

    public int secondOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public int[] searchRange(int[] arr, int target) {
    int lowerBound = firstOccurance(arr, target);
    //lowerBound == arr.length: means all elements in array are smaller than target and element is not present
    //arr[lowerBound] != target: means element is missing from the array so makes no sense to find second occurance
     if(lowerBound == arr.length || arr[lowerBound] != target){
         return new int[]{-1, -1};
     }

     return new int[]{lowerBound, secondOccurance(arr, target) - 1}; 
    }
}