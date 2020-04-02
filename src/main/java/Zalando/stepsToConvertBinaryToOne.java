package Zalando;

public class stepsToConvertBinaryToOne {

    public static void main(String[] arg) {
        String s = "101110";
        char[] chars = s.toCharArray();
        int count = 0;
        int i = s.length() - 1;
        while (i > 0) {

            if (chars[i] == '0') {
                count++;
                i--;
            } else {
                count++;


                while (chars[i] == '1' && i > 0) {
                    count++;
                    i--;
                }

                if (i == 0) {
                    count++;
                }
                chars[i] = '1';

            }
            System.out.println(count);
        }
    }
}
