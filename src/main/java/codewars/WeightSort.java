package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by murahige on 19/01/03.
 */
public class WeightSort {
    public static String orderWeight(String strng) {
        String[] strings = strng.split(" ");
        String tmp;

        for(int i=0; i < strings.length-1; i++){
            for(int j=strings.length-1; i < j;j--){
                if(sumDigit(strings[j]) < sumDigit(strings[j-1])){
                    tmp = strings[j];
                    strings[j] = strings[j-1];
                    strings[j-1] = tmp;
                }
                else if(sumDigit(strings[j]) == sumDigit(strings[j-1])){
                    List<String> list = new ArrayList<>();
                    list.add(strings[j-1]);
                    list.add(strings[j]);

                    Collections.sort(list);

                    strings[j-1] = list.get(0);
                    strings[j] = list.get(1);
                }
                System.out.println(Arrays.stream(strings).collect(Collectors.joining(" ")));
            }
        }
        return Arrays.stream(strings).collect(Collectors.joining(" "));
    }

    private static int sumDigit(String str){
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
