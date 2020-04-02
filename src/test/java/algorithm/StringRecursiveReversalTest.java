package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class StringRecursiveReversalTest {
    @Test()
    public void AnagramTest() throws Exception {
        try {
            StringRecursiveReversal srr = new StringRecursiveReversal();
            String result = srr.reverseString("creative");
            Assert.assertEquals(result , "evitaerc");
        }catch (Exception ex){
            throw ex;
        }
    }
}
