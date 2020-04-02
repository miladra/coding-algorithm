package booking;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HotelSort {

/*
breakfast beach citycenter location metro view staff price
5
1
This hotel has a nice view of the citycenter. The location is perfect.
2
The breakfast is ok. Regarding the location, it is quite far from citycenter but price is cheap so it is worth.
1
Location is excellent, 5 minutes from citycenter. There is also a metro station very close to the hotel.
1
They said I could't take my dog and there were other guests with dogs! That is not fair!
2
Very friendly staff and goof cost-benefit ratio. Its location is a bit far from citycenter.
*/
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("log.out"));


        List<Integer> hotelIds = new ArrayList<>();
        List<List<String> > reviews = new ArrayList<>();
        List<String> keyWords = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(String::toString)
                .collect(toList());
        int count = Integer.valueOf(bufferedReader.readLine());

        for(int i=1 ; i<=  count ; i++){
            int hotelId = Integer.valueOf(bufferedReader.readLine());

            hotelIds.add(hotelId);

            List<String> review = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(String::toString)
                    .collect(toList());
            reviews.add(review);
        }

        List<Integer> result = compareTriplets( keyWords, hotelIds ,reviews );
        System.out.print(result);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
    static List<Integer> compareTriplets(List<String> keyWords, List<Integer> hotelIds , List<List<String> > reviews) {


        Map<Integer , Integer> hrc = new HashMap<>();

        for(int i=0 ; i < hotelIds.size() ; i++){

            int finalI = i;
            if(!hrc.containsKey(hotelIds.get(i))) {
                hrc.put(hotelIds.get(i) , 0);
            }
            keyWords.forEach(t->{
                if(reviews.get(finalI).contains(t)){
                    int currentCount = hrc.get(hotelIds.get(finalI));
                    hrc.put(hotelIds.get(finalI) , ++currentCount);
                }
            });
        }

        List<Map.Entry<Integer , Integer>> sorted = new ArrayList(hrc.entrySet());
        Collections.sort(sorted, (o1, o2) -> {

            if(o1.getValue() == o2.getValue()){
                return o1.getKey() - o2.getKey();
            }else{
                return o2.getValue() - o1.getValue();
            }
        });

        List<Integer> result = new ArrayList<>();
        sorted.forEach(t->{
            result.add(t.getKey());
        });
        return result;
    }
}
