package codewars;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by murahige on 19/01/03.
 */
public class WeightSort {
    public static String orderWeight(String strng) {
        String[] strings = strng.split(" ");

        return Arrays.stream(strings)
                .sorted(Comparator.comparing(WeightSort::sumDigit)
                        .thenComparing(String::compareTo))
                .collect(Collectors.joining(" "));
    }

    private static int sumDigit(String str){
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
