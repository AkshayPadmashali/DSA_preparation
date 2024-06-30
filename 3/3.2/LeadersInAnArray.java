// Time: O(n) else O(nlon in case of sorting is required)
// Auxuliary : O(1)

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int maxKnown = Integer.MIN_VALUE;
        
        for(int i=n-1 ; i>=0 ; i--){
            if(arr[i] > maxKnown){
                maxKnown = arr[i];
                ans.add(arr[i]);
            }
        }
        //Collections.sort(ans); (optional)
        return ans;
    }
}