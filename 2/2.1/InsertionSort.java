//Stable sorting algorithm

//Time Complexity: 
    //Best case : O(N)
    //Worst case : O(N^2)
//Auxiliary Space Complexity: O(1)

//This works good when the array is partially sorted, therefore it is being used in hybrid sorting algorithms

public class InsertionSort {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=1 ; i< arr.length ; i++){
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}