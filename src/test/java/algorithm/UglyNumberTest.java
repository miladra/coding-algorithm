package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class UglyNumberTest {
    @Test()
    public void UglyNumberTest() throws Exception {
        try {
            UglyNumber sr = new UglyNumber();
            int result = sr.getNthUglyNo(150);
            Assert.assertEquals(result , 5832);
        }catch (Exception ex){
            throw ex;
        }
    }
}
