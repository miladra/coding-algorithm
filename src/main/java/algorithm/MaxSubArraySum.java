package algorithm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxSubArraySum {

    public static void main (String[] args) throws Exception
    {
        List<Integer> numbers = Arrays.asList(-1, 7, 8, -5, 4, 9, -2, 3);
        MaxSubArraySum mm = new MaxSubArraySum();
        int maxi = mm.maximumm(numbers);
        System.out.println(maxi);
    }

    public int maximumm(List<Integer> numbers) {
        int toIndex = 3, fromIndex = 0;
        List<Integer> result = new ArrayList<>();
        while (toIndex < numbers.size()) {
            Map<Integer, Integer> map = IntStream
                    .range(fromIndex, toIndex)
                    .filter(i->numbers.get(i)>0)
                    .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, numbers.get(i)))
                    .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey,(a,b)->a));
            // find max of sublist
            int maxOfSub = numbers.subList(fromIndex, toIndex).stream().max(Integer::compareTo).get();
            //update indexes
            fromIndex = map.getOrDefault(maxOfSub,toIndex-1) + 2;
            toIndex += fromIndex;

            if (maxOfSub > 0)
                result.add(maxOfSub);
        }
        int lastMax = numbers.subList(fromIndex, numbers.size()).stream().max(Integer::compareTo).get();
        if (lastMax > 0)
            result.add(lastMax);
        System.out.println(result);
        return result.stream().reduce(0,Integer::sum);
    }
}
