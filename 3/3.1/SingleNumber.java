public class SingleNumber {
    public int singleNumber(int[] arr) {
        int ans = 0;

        for(int element : arr){
            ans = ans ^ element;
        }
        return ans;
    }
}