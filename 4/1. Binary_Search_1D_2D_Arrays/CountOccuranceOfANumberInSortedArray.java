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

    public static int countOccurrences(int[] a, int n, int x) {
        int ind = NormalBinarySearch(a, x);

        if (ind == -1) {
            return 0;
        }

        int count = 1;
        int left = ind - 1;
        while (left >= 0 && a[left] == x) {
            count++;
            left--;
        }

        int right = ind + 1;
        while (right < n && a[right] == x) {
            count++;
            right++;
        }

        return count;
    }