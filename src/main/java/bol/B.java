package bol;

import java.util.BitSet;

public class B {
    public String solution(String S) {
        StringBuilder s = new StringBuilder(200000);
        char curChar = S.charAt(0);
        s.append(curChar);
        int treshhold = 2;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != curChar) {
                treshhold = 2;
                curChar = S.charAt(i);
                s.append(curChar);
            } else {
                treshhold--;
                if (treshhold > 0) {
                    s.append(curChar);
                }
            }
        }
        return s.toString();
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
