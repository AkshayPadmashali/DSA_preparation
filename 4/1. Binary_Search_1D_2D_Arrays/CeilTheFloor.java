public class Solution {
     public static int[] getFloorAndCeil(int[] a, int n, int x) {
        return new int[]{getFloor(n, x, a), getCeil(n, x, a)};
    }
}