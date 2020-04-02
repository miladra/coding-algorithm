package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class reverseSentenseWordsTest {
    @Test()
    public void AnagramTest() throws Exception {
        try {
            reverseSentenceWords rsw = new reverseSentenceWords();
            String result = rsw.reverseWords("Welcome to body");
            Assert.assertEquals("body to Welcome" , result);
        }catch (Exception ex){
            throw ex;
        }
    }
}
