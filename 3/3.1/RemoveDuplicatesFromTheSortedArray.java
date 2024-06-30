public class RemoveDuplicatesFromTheSortedArray {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++; //point i to new index and store the new value of arr[j]
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
