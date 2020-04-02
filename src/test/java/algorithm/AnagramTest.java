package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    @Test()
    public void AnagramTest() throws Exception {
        try {
            Anagram ana = new Anagram();
            Boolean result = ana.checkAnagram("creative", "reactive2");
           Assert.assertTrue(result);
        }catch (Exception ex){
            throw ex;
        }
    }
}
