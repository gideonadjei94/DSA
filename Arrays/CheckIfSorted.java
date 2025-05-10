package Arrays;

// Given an array of size n, the task is to check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.

//Examples:

//Input: arr[] = [20, 21, 45, 89, 89, 90]
//Output: Yes

//Input: arr[] = [20, 20, 45, 89, 89, 90]
//Output: Yes

//Input: arr[] = [20, 20, 78, 98, 99, 97]
//Output: No

public class CheckIfSorted {

    static boolean isSorted(int[] nums){
        int arrLength = nums.length;

        if(arrLength == 0 || arrLength == 1)
            return false;
        for (int i = 1; i < arrLength; i++){
            if (nums[i - 1] > nums[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {20, 20, 78, 98, 99, 97};
        System.out.println(isSorted(numbers));
    }
}
