public class MaxConsecutivesOnes {
    public int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int count = 0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 1){
                count++;

                if(count > maxCount){
                maxCount = count;
            }
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}