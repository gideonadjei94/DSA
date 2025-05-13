package Arrays;

// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
//
//Examples:
//
//Input: arr[] = {1, 4, 3, 2, 6, 5}
//Output: {5, 6, 2, 3, 4, 1}
//Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.


import java.util.Arrays;

public class ArrayReversal {

    static void reverseArray(int[] arr){
        int left = 0, right = arr.length - 1;
        int temp = 0;

        while (left < right){

        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 6, 5};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
