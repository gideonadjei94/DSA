package DataStructures.Arrays;

// Given an integer array nums, return an array answer such that answer[i]
// is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]


public class ProductOfArrExceptSelf {

    static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];

        // Prefix
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }


        // Postfix
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * postfix;
            postfix *= nums[i];
        }

        return answer;
    }

    static void printArray(int[] result){
        for (int r : result){
            System.out.print(r + ", ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        printArray(productExceptSelf(nums));
    }
}
