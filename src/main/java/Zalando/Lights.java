package Zalando;

import java.util.BitSet;

public class Lights {

    public static void main(String[] arg){

        int[] input = {1,3,5,4,2};
        int count = 0;
        BitSet bitset = new BitSet(input.length);
        int j = 0;
        for(int i=0 ; i< input.length ; i++){
            bitset.set(input[i]);
           if( bitset.previousClearBit(input[i]) == 0){
               count++;
           }
        }

        System.out.println(count);

    }
}
