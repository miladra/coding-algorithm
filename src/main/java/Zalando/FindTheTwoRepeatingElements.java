package Zalando;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheTwoRepeatingElements {

    public static void main(String[] arg) {
        int[] input = {4, 2, 4, 5, 2, 3, 1};

        int[] count = new int[input.length];
        

        Map<Integer , List<Integer>> out = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            count[input[i]]++;
            List<Integer> tem = out.get(input[i]);
            if(tem == null){
                tem = new ArrayList<>();
                tem.add(i);
            } else{
                tem.add(i);
            }

            out.put(input[i],tem);
        }
        System.out.println(out);
    }
}
