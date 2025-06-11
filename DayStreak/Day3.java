package DayStreak;

import java.util.HashSet;
import java.util.Set;

// Given a string s, find the length of the longest substring without duplicate characters.

public class Day3 {

    static int findTheLengthOfLongestUniqueSubString(String str){
        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (right < str.length()) {
            char currentChar = str.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(findTheLengthOfLongestUniqueSubString(str));
    }
}
