package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class longestUniqueSubStringTest {

    @Test
    public void longestUniqueSubsttr() {

        String str = "ABDEFGABEF";
        int len = longestUniqueSubString.longestUniqueSubString(str);
        Assert.assertEquals(6 , len);
    }
}