//Better
// Time Complexity: O(NlogN) + O(N), N = size of the given array.
// Reason: O(NlogN) for sorting the array. To find the longest sequence, we are using a loop that results in O(N).

// Space Complexity: O(1), as we are not using any extra space to solve this problem.



/**
 * Complexity Analysis
Time Complexity: O(N) + O(2*N) ~ O(3*N), where N = size of the array.
Reason: O(N) for putting all the elements into the set data structure. After that for every starting element, we are finding the consecutive elements. Though we are using nested loops, the set will be traversed at most twice in the worst case. So, the time complexity is O(2*N) instead of O(N2).

Space Complexity: O(N), as we are using the set data structure to solve this problem.

Note: The time complexity is computed under the assumption that we are using unordered_set and it is taking O(1) for the set operations. 

If we consider the worst case the set operations will take O(N) in that case and the total time complexity will be approximately O(N2). 
And if we use the set instead of unordered_set, the time complexity for the set operations will be O(logN) and the total time complexity will be O(NlogN).
 */
public class tUf {
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}



public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }