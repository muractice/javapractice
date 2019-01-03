package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by murahige on 19/01/02.
 */
public class Diamond {
    public static String print(int n){
        if(n < 0 | n % 2 == 0){
            return null;
        }

//        return IntStream.rangeClosed(1,n)
//                .filter(i -> i % 2 != 0)
//                .mapToObj(i -> {
//                    String space = "";
//                    for (int j = 0; j < (n - i)/2; j++) {
//                        space += " ";
//                    }
//                    String diamond = "";
//                    for (int j = 0; j < i; j++) {
//                        diamond += "*";
//                    }
//                    return space + diamond;
//                })
//                .collect(Collectors.joining("\n")) +
return                IntStream.rangeClosed(n,1)
                        .filter(i -> (i % 2 != 0))
                        .mapToObj(i -> {
                            String space = "";
                            for (int j = n; j < (n - i)/2; j--) {
                                space += " ";
                            }
                            String diamond = "";
                            for (int j = 0; j < i*2+1; j++) {
                                diamond += "*";
                            }
                            return space + diamond;
                        })
                        .collect(Collectors.joining("\n"));
    }
}
