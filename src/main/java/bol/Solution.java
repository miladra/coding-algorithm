package bol;

import java.util.BitSet;

public class Solution {
    public int solution(int[] A) {
        BitSet repo = new BitSet(1000000);
        for(int i = 0; i < A.length;i++){
            if (A[i]>0) {
                repo.set(A[i] - 1);
            }
        }
        return repo.nextClearBit(0) + 1;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
