package Arrays;

// Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order.
// Additionally, return the length of this distinct sorted subarray.

//Note: The elements after the distinct ones can be in any order and hold any value, as they don’t affect the result.

//Examples:

//Input: arr[] = [2, 2, 2, 2, 2]
//Output: [2]
//Explanation: All the elements are 2, So only keep one instance of 2.

//Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
//Output: [1, 2, 3, 4, 5]
//
//Input: arr[] = [1, 2, 3]
//Output: [1, 2, 3]
//Explanation : No change as all elements are distinct.

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums){
        int arrLength = nums.length;
        if(arrLength <= 1)
            return arrLength;

        int idx = 1;

        for(int i = 1; i < arrLength; i++){
            if(nums[i] != nums[i - 1]){
                nums[idx++] = nums[i];
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newArrSize = removeDuplicates(arr);

        for (int i = 0; i < newArrSize; i++)
            System.out.print(arr[i] + " ");

    }

}
