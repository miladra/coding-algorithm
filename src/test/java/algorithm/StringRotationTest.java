package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class StringRotationTest {
    @Test()
    public void StringRotationTest() throws Exception {
        try {
            StringRotation sr = new StringRotation();
            String result = sr.wordRotation("big$");
            Assert.assertEquals(result , "$gib");
        }catch (Exception ex){
            throw ex;
        }
    }
}
