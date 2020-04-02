package algorithm;

import java.util.regex.Pattern;

public class reverseSentenceWords {

    public String reverseWords(String str){

        Pattern pattern =   Pattern.compile("\\s");
        String[] tempStr = pattern.split(str);
        String result = "";
        result = tempStr[tempStr.length - 1];
        for(int i=tempStr.length - 2; i>=0  ; i-- ){
            result =  result + " " +tempStr[i];
        }

        return  result;
    }
}
