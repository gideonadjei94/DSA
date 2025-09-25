package DataStructures.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]


public class MoveZeroes {

    static void moveZeroes(int[] nums){
        int n = nums.length;
        int left = 0, right = 0;
        while(right != n){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left]  = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }


    static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        printArray(arr);
    }


}
