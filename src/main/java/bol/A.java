package bol;

import java.util.BitSet;

public class A {
    public int solution(int[] A) {
        int result = -1000;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0 && A[i] > result) {
                result = A[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
