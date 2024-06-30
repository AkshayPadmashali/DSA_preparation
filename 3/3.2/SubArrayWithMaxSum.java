// Time: O(n)
//Auxiliary space: O(1)

public class SubArrayWithMaxSum {
    public int maxSubArray(int[] arr) {
        int prefixSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int element: arr){
            prefixSum = prefixSum + element;
            maxSum = Math.max(maxSum, prefixSum);

            if(prefixSum < 0) prefixSum = 0;
        }
        return maxSum;
    }
}