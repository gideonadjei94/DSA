package Arrays;


//Given an unsorted array arr of positive integers.
// One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array.
//Find numbers a and b.
//Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].

//Examples:

//Input: arr[] = [2, 2]
//Output: [2, 1]
//Explanation: Repeating number is 2 and smallest positive missing number is 1.

import java.util.ArrayList;


public class MissingAndRepeating {

    static ArrayList<Integer> findTheMissingAndRepeatingElement(int[] arr){
        int n = arr.length;
        int repeating = -1, missing = -1;

        // Step 1: Mark visited numbers
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] < 0) {
                repeating = val;
            } else {
                arr[val - 1] *= -1;
            }
        }

        // Step 2: Find the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.out.println(findTheMissingAndRepeatingElement(nums));
    }
}
