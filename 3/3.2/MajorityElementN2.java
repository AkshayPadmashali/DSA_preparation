public class MajorityElementN2 {
    public int majorityElement(int[] arr) {
         //size of the given array:
        int n = arr.length;
        int count = 0; 
        int currentElement = 0; 

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                currentElement = arr[i];
            } else if (currentElement == arr[i]) count++;
            else count--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == currentElement) cnt1++;
        }

        if (cnt1 > (n / 2)) return currentElement;
        return -1;
    }
}