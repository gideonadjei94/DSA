package DataStructures.Arrays;

import java.util.HashSet;

public class LongestConsecutiveSeq {

    static int findLongestConsecutiveSeq(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for (int num : set){
            if (!set.contains(num - 1 )){
                int length = 1;
                while (set.contains(num + length)){
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }


    public static void main(String[] args) {
        int[] nums = {2, 20, 4, 10, 3, 4, 5};
        System.out.println(findLongestConsecutiveSeq(nums));
    }
}
