package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.regex.*;


/**
 * Created by murahige on 19/01/02.
 */
public class Catalog {
    public static String catalog(String s,String article){
        String[] strings = s.split("\n\n");
        return Arrays.stream(strings)
        .filter(s2 -> s2.contains(article))
                .map(s3 -> String.format("%s > prx: $%s qty: %s"
                            ,s3.substring(s3.indexOf("<name>") + 6, s3.indexOf("</name>"))
                            ,s3.substring(s3.indexOf("<prx>") + 5, s3.indexOf("</prx>"))
                            ,s3.substring(s3.indexOf("<qty>") + 5, s3.indexOf("</qty>"))
                        )
                )
        .collect(Collectors.joining("\n"));

    }

    public static String catalogMatcher(String s,String article){
//        Pattern p = Pattern.compile("<name>(.*)?</name>.*?<prx>(.*)?</prx>.*?<qty>(.*)?</qty>");
        Pattern p = Pattern.compile("<name>(.*)</name><prx>(.*)</prx><qty>(.*)</qty>");
        Matcher m = p.matcher(s);
        ArrayList<String> res = new ArrayList<>();

        while(m.find()){
            if(!m.group(0).contains(article)) continue;
            res.add(m.group(1)+ " > prx: $"+ m.group(2) + " qty: "+ m.group(3));
        }
        if(res.isEmpty()) return "Nothing";

        return res.stream().collect(Collectors.joining("\n"));
    }


}
