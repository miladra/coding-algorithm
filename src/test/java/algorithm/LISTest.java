package algorithm;

import org.junit.Test;

public class LISTest {
    @Test
    // driver program to test above functions
    public void lisTest()
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        LIS lis = new LIS();
        lis.lis(arr, n);
    }

    @Test
    public void lisOptimalTest()
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        LIS lis = new LIS();
        lis.lisOptimal(arr, n);
    }

    @Test
    public void lengthOfLIS()
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        LIS lis = new LIS();
        lis.lengthOfLIS(arr);
    }
}
