package DataStructures.Arrays;

import java.util.*;

public class TwoSumII {

    static int[] getTwoSum(int[] nums, int target){
        int left = 0, right = nums.length -1;

        while (left < right){
            int currSum = nums[left] + nums[right];
            if(currSum < target){
                left++;
            }
            else if(currSum > target){
                right--;
            }
            else {
                return new int[]{
                        left + 1 , right + 1
                };
            }
        }

        return  new int[]{};
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(getTwoSum(nums, 3)));
    }
}
