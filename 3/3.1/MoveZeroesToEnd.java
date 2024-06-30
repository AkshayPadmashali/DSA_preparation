public class MoveZeroesToEnd {
    public void moveZeroes(int[] a) {

        int i=0;
        for(i=0 ; i<a.length ; i++)
        {
            if(a[i] == 0)
            {
                break;
            }
        }

        int j=i+1;
        while(i < a.length && j<a.length)
        {
            if(a[j] != 0)
            {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
            j++;
        }
    }
}