package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class longetPalinsustringTest {
    @Test()
    public void longetPalinsustringTest() throws Exception {
        try {
            longestPalinSubstring lp = new longestPalinSubstring();
            String result = lp.longestPalindorme("forgeeksskeegfor");
            Assert.assertEquals("geeksskeeg" , result);
        }catch (Exception ex){
            throw ex;
        }
    }
}
