package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class StringContainsDigitTest {
    @Test()
    public void StringTest() throws Exception {
        try {
            StringContainsDigit scd = new StringContainsDigit();
            Boolean result = scd.IsStringContainsDigit("cre2ative");
            Assert.assertTrue(result);
        }catch (Exception ex){
            throw ex;
        }
    }
}
