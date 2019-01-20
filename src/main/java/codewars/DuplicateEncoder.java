package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by murahige on 19/01/19.
 */
public class DuplicateEncoder {
    static String encode(String word) {
        return Arrays.stream(word.toLowerCase().split(""))
                .map(s -> {
                            if (Arrays.stream(word.split(""))
                                    .filter(s2 -> {
                                        return s2.equalsIgnoreCase(s);
                                    }).count() > 1
                                    ) {
                                return ")";
                            }
                            return "(";
                        }

                )
                .collect(Collectors.joining(""));
    }
}
