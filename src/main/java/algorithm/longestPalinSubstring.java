package algorithm;

public class longestPalinSubstring{

    public String longestPalindorme(String str){

        int maxLength = 1;

        int start = 0;
        int len = str.length();
        int low,high;
        for(int i = 1 ; i< len ; ++i){

            low = i-1;
            high = i;
            char c1 = str.charAt(low);
            char c2 = str.charAt(high);
            while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)){
                if(high- low +1 > maxLength ){
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

            low = i-1;
            high = i + 1;
            char c3 = str.charAt(low);
            char c4 = str.charAt(high);
            while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)){
                if(high- low +1 > maxLength ){
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

        }
        String  result = str.substring(start, start + maxLength - 1);
     return result;
    }
}