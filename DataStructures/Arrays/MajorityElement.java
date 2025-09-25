package DataStructures.Arrays;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(majorityElement(arr));
    }
}
