package DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complimentMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if (complimentMap.containsKey(compliment))
                return new int[]{complimentMap.get(compliment), i};
            complimentMap.put(nums[i], i);
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }
}
