package serviceHouse;

import java.util.HashMap;
import java.util.Map;

public class C {

    public static void main(String[] arg){
        C c = new C();
        c.f1("ACAX");
    }

    public int f1(String A) {
        int total = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i + 1; j <= A.length(); j++) {
                total += f2(A.substring(i, j));
            }
        }
        return total;
    }

    public int f2(String str) {
        if (str.length() == 1);
        Integer x;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            x = map.get(str.charAt(i));
            if (x == null) {
                map.put(str.charAt(i), 1);
            } else if (x == 1) {
                map.put(str.charAt(i), 2);
            }
        }
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value == 1) {
                sum++;
            }
        }
        return sum;

    }
}
