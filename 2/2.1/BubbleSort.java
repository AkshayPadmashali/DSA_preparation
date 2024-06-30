//Stable sorting algorithm

//Time Complexity: 
    //Best case : O(N)
    //Worst case : O(N^2)
//Auxiliary Space Complexity: O(1)

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for(int i=0 ; i<n-1 ; i++){
            boolean didSwappingOccured = false;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    didSwappingOccured = true;
                }
            }

            if(!didSwappingOccured){
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}