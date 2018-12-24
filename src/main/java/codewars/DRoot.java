package codewars;

import java.util.Arrays;

/**
 * Created by murahige on 18/12/23.
 */
public class DRoot{
    public static int digital_root(int n) {
        return sumDigit(sumDigit(n));
    }

    private static int sumDigit(int n){
        String[] strNs = Integer.toString(n).split("");
        return Arrays.stream(strNs).mapToInt(Integer::parseInt).sum();
    }
}
