package algorithm;

public class StringContainsDigit {

    public Boolean IsStringContainsDigit(String str){
        char[] strArray = str.toCharArray();
        for (char c  : strArray) {
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
