package algorithm;

public class StringRotation {

    public String wordRotation(String str){

        char[] chars = str.toCharArray();
        int length =chars.length;
        int i = 0;
        int j = 0;
        if(length % 2 == 0){
            int mid = (length / 2);
             i = mid-1;
             j = mid;


        }else{
            int mid = (length / 2) + 1;
            i = mid - 1;
            j = mid + 1;

        }
        while (j < length){
            swap(chars , i , j);
            i--;
            j++;
        }

     return new String(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp=chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
