package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    static String encode(List<String> strs){
        StringBuilder builder = new StringBuilder();

        for (String s : strs)
            builder.append(s.length()).append("#").append(s);

        return builder.toString();
    }


    static List<String> decode(String str){
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int lengthOfStr = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + lengthOfStr;
            list.add(str.substring(i , j));
            i = j;
        }
        return list;
    }


    public static void main(String[] args) {
        List<String> strs = List.of("neet","code","love","you");

        System.out.println(encode(strs));
        System.out.println(decode(encode(strs)));
    }
}
