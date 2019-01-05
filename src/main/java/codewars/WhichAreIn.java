package codewars;

import java.util.Arrays;

/**
 * Created by murahige on 19/01/04.
 */
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(a1 -> Arrays.stream(array2).filter(a2-> a2.contains(a1)).count() > 0)
                .sorted()
                .toArray(s-> new String[s]);
    }
}
