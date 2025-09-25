package DataStructures.Arrays;
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2

public class FirstMissingPositiveInteger {

    static int findTheFirstMissingPositiveInteger(int[] nums  ){
        int n = nums.length;

        for(int i = 0; i < n; i++){

            // Checking if value is within range and at the right position or index
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] -1] != nums[i]){

                // Swap positions if in range and not at the right index
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            if (nums[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;

    }


    public static void main(String[] args) {
        int[] input = {7, 8, 9, 11, 12};
        System.out.println(findTheFirstMissingPositiveInteger(input));
    }
}
