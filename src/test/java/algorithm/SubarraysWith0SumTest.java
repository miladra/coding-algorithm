package algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SubarraysWith0SumTest {
    @Test()
    public void SubarraysWith0SumTestMethod() throws Exception {
        try {
            SubarraysWith0Sum sw0s = new SubarraysWith0Sum();

            int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
            int n = arr.length;

            ArrayList<Pair> out = sw0s.findSubArrays(arr, n);

            Assert.assertTrue(true);

        }catch (Exception ex){
            throw ex;
        }
    }
}
