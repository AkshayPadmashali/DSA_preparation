//Not Stable sorting algorithm

//Time Complexity: 
    //Best case : O(N^2)
    //Worst case : O(N^2)
//Auxiliary Space Complexity: O(1)

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            int smallest = i;
            for(int j = i+1 ; j<n ; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

           swap(arr, i, smallest);
        }
    }


    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}