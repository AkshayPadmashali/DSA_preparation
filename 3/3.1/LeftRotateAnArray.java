public class LeftRotateAnArray {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        reverse(0, n-1, a);
        reverse(0, k-1, a);
        reverse(k, n-1, a);
    }

    public void reverse(int low, int high, int[] arr)
    {
        while(low < high)
        {
            swap(low, high, arr);
            low++;
            high--;
        }
    }

    public void swap(int i, int j, int[] arr){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}