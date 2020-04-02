package algorithm;

import java.util.Arrays;

public class Anagram {

    //Check whether two strings are anagram of each other
    public Boolean checkAnagram(  String str1, String str2) throws Exception {
        int len, len1, len2, i, j, found=0, not_found=0;

        len1 = str1.length();
        len2 = str2.length();

        if(len1 == len2)
        {
            len = len1;
            for(i=0; i<len; i++)
            {
                found = 0;
                for(j=0; j<len; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        found = 1;
                        break;
                    }
                }
                if(found == 0)
                {
                    not_found = 1;
                    break;
                }
            }
            if(not_found == 1)
            {
               return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            throw new Exception("Both Strings Must have the same number of Character to be an Anagram");
        }
    }

    // Time Complexity O(nLogn)
    public Boolean checkAnagram2(  String str1, String str2) throws Exception {

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        Boolean flag = true;
        for(int i=0; i< str1Chars.length ; i++) {
            if(str1Chars[i] != str2Chars[i]){
                flag = false;
            }

        }
        return flag;
    }
}
