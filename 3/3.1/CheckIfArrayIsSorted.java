public class CheckIfArrayISSorted {
    public boolean check(int[] arr) {
        // here we compare all the neighbouring elemnts and check whether they are in somewhat sorted
        // there will be a small change due to rotation in the array at only one place.
        // so if there are irregularities more than once, return false
        // else return true;
        int irregularities = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length])
                irregularities += 1;
        }
        return irregularities > 1 ? false : true;
    }
}