package DataStructures.Arrays;

import java.util.HashMap;

public class IsValidAnagram {

    static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> mapOfs = new HashMap<>();
        HashMap<Character, Integer> mapOft = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            mapOfs.put(s.charAt(i), mapOfs.getOrDefault(s.charAt(i), 0 ) + 1);
            mapOft.put(t.charAt(i), mapOft.getOrDefault(t.charAt(i), 0 ) + 1);
        }

        return mapOfs.equals(mapOft);
    }



    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isValidAnagram(s, t));
    }
}
