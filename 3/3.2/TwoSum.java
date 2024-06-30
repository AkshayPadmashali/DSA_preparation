// Variety 1: where return boolean, is present or not (Better: using Map, Best: 2 pointers approach)
// Variety 2: where reaturn both indexes.(Best: using Map)

// Variety 2: BEST
//Time: O(N) + O(N*logN)
//Space: O(1)
public static int[] twoSum(int n, int []arr, int target) {
    int[] ans = new int[2];
    ans[0] = ans[1] = -1;
    HashMap<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int moreNeeded = target - num;
        if (mpp.containsKey(moreNeeded)) {
            ans[0] = mpp.get(moreNeeded);
            ans[1] = i;
            return ans;
        }

        mpp.put(arr[i], i);
    }
    return ans;
}

// Variety 1: BEST
//Time: O(N) + O(N*logN)
//Space: O(1)
public class tUf {
   public static String twoSum(int n, int []arr, int target) {
        // Arrays.sort(arr); (OPTIONAL).
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

}